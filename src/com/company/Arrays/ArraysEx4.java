package com.company.Arrays;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysEx4 {

    public static void main(String[] args) {
        // float[] numberFromUser;


      /*  String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
        do {
            numberFromUser = (numberInString);
        }

        while (numberInString == null){
    }

        multipleBy2Array(numberFromUser);*/
        float[] mainFloatArray = new float[]{2.8f, 4.2f, 8.1f, 9.5f, 20};
    //}


  //  public static void multipleBy2Array(float[] mainFloatArray) {

        float[] floatArrayMultiplyBy2 = new float[mainFloatArray.length];


        for (int i = 1; i <= mainFloatArray.length; i++) {
            float numbeFromMainFloatArray = mainFloatArray[i - 1];
            float doubledValue = 2 * numbeFromMainFloatArray;
            floatArrayMultiplyBy2[i - 1] = doubledValue;


        }
        System.out.println(Arrays.toString(floatArrayMultiplyBy2));
    }
    // System.out.println(Arrays.toString(mainFloatArray));
    // System.out.println(Arrays.toString(floatArrayMultiplyBy2));
}



