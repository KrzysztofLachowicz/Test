package com.company.Arrays;

import java.util.Arrays;

public class ArraysEx8Data {
    private int[][] giveNumber;

    public ArraysEx8Data(int[][] giveNumber) {
        this.giveNumber = giveNumber;
    }

    @Override
    public String toString() {
        return "ArraysEx8Data{" +
                "giveNumber=" + Arrays.toString(giveNumber) +
                '}';
    }

    public int calculationNumbers() {
        int sum = 0;
        for (int[] innerTable : giveNumber) {
            for (int value : innerTable) {

                sum += value;
            }
        }
        return sum;
    }
}





