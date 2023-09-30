package com.example.demo.controller;

import com.example.demo.model.FindMiddleNumModel;
import com.example.demo.service.FindMiddleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class FindMiddleNumController {

    @Autowired
    private final FindMiddleService fms;

    // Если без ломбока, то стандартно инъекция зависимости делается вот так через конструктор п @Autowired
    public FindMiddleNumController(FindMiddleService fms) {
        this.fms = fms;
    }


    @PostMapping("/api/random/find-middle")
    String insert(@Valid @RequestBody FindMiddleNumModel fmm)
    {
        return fms.findMiddleNum(fmm);
    }
}
