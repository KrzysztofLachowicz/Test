package com.company.SamouczekTasks.Zadania_sam;

import javax.swing.*;

public class ForLoopEx6 {
    public static void main(String[] args) {
        sumNumbersFromUser(3);
    }
    private static void sumNumbersFromUser(int numbersSize) {
        float sum = 0;
        float avr=0;
        for (int i = 1; i <= numbersSize; i++) {
            String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
            float numberFromUser = Float.valueOf(numberInString);
            System.out.println("Liczba nr " + i + " to: " + numberFromUser);
            sum += numberFromUser;
            avr =sum/numbersSize;

        }

        System.out.println("sum = " + sum + ", i średnia arytmetyczna to = " + avr);
    }
}

