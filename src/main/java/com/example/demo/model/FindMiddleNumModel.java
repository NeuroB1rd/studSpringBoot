package com.example.demo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Random;
import java.util.stream.IntStream;

public class FindMiddleNumModel {

    @Min(1)
    private int size;

    private int highestNum;

    private int[] array;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHighestNum() {
        return highestNum;
    }

    public void setHighestNum(int highestNum) {
        this.highestNum = highestNum;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

}
