package com.example.demo.controller;

import com.example.demo.model.FindMiddleNumModel;
import com.example.demo.service.FindMiddleService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@Validated
@RestController
public class FindMiddleNumController {
    Logger logger = LoggerFactory.getLogger(FindMiddleNumController.class);

    @PostMapping("/api/random/find-middle")
    String insert(@Valid @RequestBody FindMiddleNumModel fmm)
    {

        String result;
        //я не понял как исправить
        FindMiddleService fms = new FindMiddleService();
        result = fms.findMiddleNum(fmm);

        return result;
    }
}
