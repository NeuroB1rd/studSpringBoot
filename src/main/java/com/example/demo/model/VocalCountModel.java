package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public class VocalCountModel {
    private static final Map<String,Integer> myMap = new HashMap<String, Integer>();

    public static Integer getHashWords(String key){
        return myMap.get(key);
    }

    public static boolean isContain(String key){
        return myMap.containsKey(key);
    }
    public static void addHashWord(String key,int value){
        myMap.put(key,value);
    }
}
