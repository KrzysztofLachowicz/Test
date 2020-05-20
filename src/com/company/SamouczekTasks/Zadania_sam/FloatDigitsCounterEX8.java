package com.company.SamouczekTasks.Zadania_sam;

import javax.swing.*;

public class FloatDigitsCounterEX8 {

    public static void main(String[] args) {
        doingOperationOnFloat(3);
    }
    public static void doingOperationOnFloat(int qtyDigits) {
        float sum = 0;
        float avr=0;

        for (int i = 1; i <= qtyDigits; i++) {
            String qtyInString = JOptionPane.showInputDialog("Podaj liczbę:");
            float valueFromUser = Float.valueOf(qtyInString);
            System.out.println("Liczba nr " + i + " to: " + valueFromUser);
            sum += valueFromUser;
            avr =sum/qtyDigits;

        }

        System.out.println("Ilość podanych liczb to: " + qtyDigits + ", " + "suma to = " + sum + ", " + " i średnia arytmetyczna to = " + avr);
    }
}
