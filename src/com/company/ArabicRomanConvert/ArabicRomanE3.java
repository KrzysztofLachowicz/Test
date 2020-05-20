package com.company.ArabicRomanConvert;

public class ArabicRomanE3 {
    public static void main(String[] args) {

        /*char I = 8544;
        char II = 8545;
        char III = 8546;
        char IV = 8547;
        char V = 8548;
        char VI = 8549;
        char VII = 8550;
        char VIII = 8551;
        char IX = 8552;*/
        //  int num = II;
        // System.out.println (VIII);
        String romanNumber = "VII";
        int arabicNumber = convertToArabic(romanNumber);
        System.out.println("romanNumber: " + romanNumber + ", arabicNumber: " + arabicNumber);
        //convertToArabic("VIII");

      /*  switch (num) {
            case 8544:
                System.out.println("I" + " - " + "1");
                break;
            case 8545:
                System.out.println("II" + " - " + "2");
                break;
            case 8546:
                System.out.println("III" + " - " + "3");
                break;
            case 8547:
                System.out.println("IV" + " - " + "4");
                break;
            case 8548:
                System.out.println("V" + " - " + "5");
                break;
            case 8549:
                System.out.println("VI" + " - " + "6");
                break;
            case 8550:
                System.out.println("VII" + " - " + "7");
                break;
            case 8551:
                System.out.println("VIII" + " - " + "8");
                break;
            case 8552:
                System.out.println("IX" + " - " + "9");
                break;
            default:
                System.out.println("Unknown type!");
        }*/


    }

    public static int convertToArabic(String romanNumber) {
        switch (romanNumber) {
            case "VIII":
                return 8;
            case "V":
                return 5;
            default:
                return -1;
        }
    }
}

