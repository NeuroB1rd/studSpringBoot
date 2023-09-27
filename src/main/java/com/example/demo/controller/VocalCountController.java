package com.example.demo.controller;

import com.example.demo.service.VocalCountService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class VocalCountController {

    LoggingController logControl = new LoggingController();

    @PostMapping("/api/storage/word")
    String insert(@Valid @RequestBody @Pattern(regexp = "^[а-яА-ЯёЁ]+$") String str)
    {
        VocalCountService vcs = new VocalCountService();
        int c = vcs.getVocalCount(str);
        logControl.vocalCountLogging(str,c);
        return "Word:" + str.toString() + "Vocal count:" + c;

    }
}
