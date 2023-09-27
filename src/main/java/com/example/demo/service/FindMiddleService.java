package com.example.demo.service;

import com.example.demo.model.FindMiddleNumModel;

import java.util.Random;
import java.util.stream.IntStream;

public class FindMiddleService {
    public FindMiddleNumModel genMassive(FindMiddleNumModel fmm){
        Random random = new Random();
        int[] a = new int[fmm.getSize()];

        System.out.println(fmm.getHighestNum());

        for(int i = 0; i <  a.length; i++) {
            a[i] = random.nextInt(fmm.getHighestNum());
        }
        fmm.setArray(a);
        return fmm;
    }

    public int findMiddleNum(FindMiddleNumModel fmm){
        int[] a;
        a = fmm.getArray();
        return a[(int)fmm.getSize()/2];
    }
}
