package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public class VocalCountModel {

    private static VocalCountModel VCM;

    private static final Map<String,Integer> myMap = new HashMap<>();

    public static VocalCountModel getVCM(){
        if(VCM == null){
            VCM = new VocalCountModel();
        }
        return VCM;
    }

    public static boolean isContain(String key){
        return myMap.containsKey(key);
    }
    public static Integer getHashWords(String key){
        return myMap.get(key);
    }
    public static void addHashWord(String key,int value){
        myMap.put(key,value);
    }
}
