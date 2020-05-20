package com.company.Arrays;

import java.util.Arrays;

public class ArraysEx2Data {
   private int[] giveNumber;

    public ArraysEx2Data(int[] giveNumber) {
        this.giveNumber = giveNumber;
    }

    @Override
    public String toString() {
        return "ArraysEx2Data{" +
                "giveNumber=" + Arrays.toString(giveNumber) +
                '}';
    }


    public int calculationNumbers() {
        int sum = 0;
        for (int valueI: giveNumber) {
                     sum += valueI;
        }
        return sum;

    }


}
