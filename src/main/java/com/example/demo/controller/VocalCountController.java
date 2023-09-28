package com.example.demo.controller;

import com.example.demo.service.VocalCountService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class VocalCountController {

    @PostMapping("/api/storage/word")
    String insert(@Valid @RequestBody @Pattern(regexp = "^[а-яА-ЯёЁ]+$") String str)
    {
        VocalCountService vcs = new VocalCountService();
        return "Word:" + str + "Vocal count:" + vcs.getVocalCount(str);

    }
}
