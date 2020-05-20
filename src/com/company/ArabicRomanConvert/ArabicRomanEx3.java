package com.company.ArabicRomanConvert;

import java.util.Scanner;

public class ArabicRomanEx3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj cyfrę rzymską: ");
        String romanNumber = scanner.next();
        int arabicNumber = convertToArabic(romanNumber);
        System.out.println("romanNumber: " + romanNumber + ", arabicNumber: " + arabicNumber);
    }

    public static int convertToArabic(String romanNumber) {

        switch (romanNumber) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 5;
            case "IX":
                return 9;
            default:
                return -1;

        }
    }
}
