package com.company.FirstBeginTasks;

import java.util.Scanner;


public class DaysOfWeekEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dzień tygodnia ");
      // int dzień = 9;
        int dzień = scanner.nextInt();

        switch (dzień) {
            case 1:
                System.out.println("Ten dzień to poniedziałek do weekendu 5");
                break;
            case 2:
                System.out.println("Ten dzień to wtorek do weekendu 4 dni");
                break;
            case 3:
                System.out.println("Ten dzień to środa do weekendu 3 dni");
                break;
            case 4:
                System.out.println("Ten dzień to czwartek, do wekendu 2 dni");
                break;
            case 5:
                System.out.println("Ten dzień to piątek, do weekendu 1 dzień");
                break;
            case 6:
                System.out.println("Ten dzień to sobota, mamy weekend!!! - Relaks");
                break;
            case 7:
                System.out.println("Ten dzień to niedziela, mamy weekend!!! - jutro do pracyu");
                break;
            default:
                System.out.println("Nie ma takiego dnia");
        }
    }
}
