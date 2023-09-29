package com.example.demo.controller;

import com.example.demo.service.VocalCountService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor // инъекция зависимостей с помощью ааннотации ломбока, заменяет конструктор
public class VocalCountController {

    @Autowired
    private final VocalCountService vcs;

    @PostMapping("/api/storage/word")
    String insert(@Valid @RequestBody @Pattern(regexp = "^[а-яА-ЯёЁ]+$") String str)
    {
        return "Word:" + str + "Vocal count:" + vcs.getVocalCount(str);
    }

}
