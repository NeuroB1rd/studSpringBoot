package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public class VocalCountModel {

    private static VocalCountModel VCM;

    // наименование констант в таком стиле
    private static final Map<String,Integer> MY_MAP = new HashMap<>();

    // приватный конструктор, чтобы нельзя было создать экземпляр
    // еще где то кроме статичного метода getVCM
    private VocalCountModel() {

    }

    // Эти методы не должны быть статичными, так как у нас гарантировано будет 1 объект данного класса
    // И эти методы доступны у этого экземпляра конкретно, а не у класса как статика, тогда нету смысла
    //так как можно к ним обратиться без экземпляра класса.
    public static VocalCountModel getVCM() {
        if (VCM == null){
            VCM = new VocalCountModel();
        }
        return VCM;
    }

    public boolean isContain(String key){
        return MY_MAP.containsKey(key);
    }

    public Integer getHashWords(String key){
        return MY_MAP.get(key);
    }

    public void addHashWord(String key,int value) {
        MY_MAP.put(key,value);
    }


}
