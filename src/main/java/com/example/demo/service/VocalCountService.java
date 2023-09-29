package com.example.demo.service;

import com.example.demo.model.VocalCountModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class VocalCountService {
    private static final Logger logger = LoggerFactory.getLogger(VocalCountService.class);
    private static final Pattern vocals = Pattern.compile("(?iu)[аеёиоуыэюя]");

    public int getVocalCount(String str){

        int vocalCounter = 0;
        VocalCountModel vcm = VocalCountModel.getVCM();

        if(vcm.isContain(str)) {
            logger.info("Слово уже есть в HashMap");
            return vcm.getHashWords(str);
        } // тут можно без else, така как если зайдет в иф, то через return выйдет из функции и мы не дойдем до след участка кода,
        // а если не зайдет в иф то попадет в код дальше и также выйдет.
        Matcher m = vocals.matcher(str);
        while (m.find()) {
            vocalCounter++;
        }
        vcm.addHashWord(str,vocalCounter);
        logger.info("Входящее слово: {}, рассчитано кол-во гласных: {}", str,vocalCounter);
        return vocalCounter;
    }

}
