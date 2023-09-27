package com.example.demo.service;

import com.example.demo.controller.LoggingController;
import com.example.demo.model.VocalCountModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VocalCountService {
    LoggingController logControl = new LoggingController();
    Pattern vocals = Pattern.compile("(?iu)[аеёиоуыэюя]");

    public int getVocalCount(String str){
        int vocalCounter = 0;
        VocalCountModel vcm = new VocalCountModel();

        if(vcm.isContain(str) == true) {
            logControl.vocalHashLogging();
            return vcm.getHashWords(str);
        }else{
            Matcher m = vocals.matcher(str);
            while (m.find()) {
                vocalCounter++;
            }
            vcm.addHashWord(str,vocalCounter);
            return vocalCounter;
        }
    }
}
