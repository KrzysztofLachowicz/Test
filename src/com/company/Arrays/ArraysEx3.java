package com.company.Arrays;

import javax.swing.*;
import java.util.Arrays;

public class ArraysEx3 {

    public static void main(String[] args) {

        String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
        int numberFromUser = Integer.valueOf(numberInString);
        // System.out.println(Arrays.toString());

      //  evenNumber(numberFromUser);
        evenNumberWhile(numberFromUser);

    }
   /*   public static void evenNumber (int numberFromUser) {
         //   String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
           // int numberFromUser = Integer.valueOf(numberInString);
            int[] evenNumbersArray = new int[numberFromUser];

            for (int i = 1; i <= numberFromUser; i++) {
                evenNumbersArray[i - 1] = i * 2;

            }
            System.out.println(Arrays.toString(evenNumbersArray));

           // return evenNumbersArray[];
        }*/

        public static void evenNumberWhile(int numberFromUser){
            int[] evenNumbersArray = new int[numberFromUser];
        int i =1;
        while(i<=numberFromUser){
            evenNumbersArray[i-1]=i*2;
            i++;

        }
            System.out.println(Arrays.toString(evenNumbersArray));
        }
    }
//}
