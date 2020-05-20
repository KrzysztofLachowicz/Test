package com.company.TemperatureTasks;

import java.util.Scanner;

public class FahrenheitConverter {
   int t;
    int c;

    public FahrenheitConverter(int c) {
        this.c = c;
    }



    /**
     * program przelicza temperaturę podaną
     * w stopnich Fahrenheita na wartość w stopnich Celcjusza
     */
    // public static void main(String[] args) {}

    /* podaj wartosc temperatury w stopniach Fahrenheta*/
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("podaj wartosc temperatury w stopniach Fahrenheta: ");
        char d = 176;
        int t = scanner.nextInt();
       /* double C = ((t - 32) / 2) * 1.11;
        System.out.println("Wartość temperaturyw w stopniach Fahrenheita to:" + t + d + "F");
        System.out.println("Wartość temperatury w stopniach C =" +  + d + "C");*/
    public double fahrenheitConverter() {
        //char d = 176;
        double C;
        C = ((t - 32) / 2) * 1.11;
        return (C);
    }

    public double celciusConverter() {
        double F;
        F = c * (9 / 5) + 32;
        return F;
    }


}
