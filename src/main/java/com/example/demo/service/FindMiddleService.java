package com.example.demo.service;

import com.example.demo.model.FindMiddleNumModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class FindMiddleService {

    private static final Logger logger = LoggerFactory.getLogger(FindMiddleService.class);

    private int[] genMassive(FindMiddleNumModel fmm){
        Random random = new Random();
        int[] a = new int[fmm.getSize()];

        System.out.println(fmm.getHighestNum());

        for(int i = 0; i <  a.length; i++) {
            a[i] = random.nextInt(fmm.getHighestNum());
        }

        return a;
    }

    public String findMiddleNum(FindMiddleNumModel fmm){

        int[] a = genMassive(fmm);
        Instant start = Instant.now();
        int middle = a[(int)fmm.getSize()/2];
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(duration.toMillis()),
                TimeUnit.MILLISECONDS.toMinutes(duration.toMillis()) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(duration.toMillis())),
                TimeUnit.MILLISECONDS.toSeconds(duration.toMillis()) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration.toMillis())));

        logger.info("Найденое число: {}, время на поиск: {}", middle,hms);

        return "Значение из серидины массива:" + middle + "Время поиска:" + hms + ".... Массив:" + Arrays.toString(a);
    }
}
