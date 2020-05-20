package com.company.FirstBeginTasks;

import java.util.Scanner;

public class CheckUniEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int mark = scanner.nextInt();


            if (48 <= mark && mark <= 57) {
                System.out.println("Ten unicode to cyfra z przedziału 0-9");
            } else if (65 <= mark && mark <= 90) {
                System.out.println("Ten unicode to litera z przedziału A-Z");
            } else if (97 <= mark && mark <= 122) {
                System.out.println("Ten unicode to litera z przedziału a-z");
            } else {
                System.out.println("Ten unicode oznacza coś innego");
            }
        }

    }
