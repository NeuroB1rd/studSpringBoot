package com.example.demo.controller;

import com.example.demo.model.FindMiddleNumModel;
import com.example.demo.service.FindMiddleService;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@Validated
@RestController
public class FindMiddleNumController {
    LoggingController logControl = new LoggingController();

    @PostMapping("/api/random/find-middle")
    String insert(@Valid @RequestBody FindMiddleNumModel fmm)
    {

        int result;
        FindMiddleService fms = new FindMiddleService();
        fmm = fms.genMassive(fmm);
        long startTime = System.nanoTime();
        result = fms.findMiddleNum(fmm);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(duration),
                TimeUnit.MILLISECONDS.toMinutes(duration) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(duration)),
                TimeUnit.MILLISECONDS.toSeconds(duration) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));

        return "Значение из серидины массива:" + result + "Время поиска:" + hms + ".... Массив:" + Arrays.toString(fmm.getArray());
    }
}
