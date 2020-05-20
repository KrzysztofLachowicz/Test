package com.company.FirstBeginTasks;

public class ComapreNumbersEx1 {
    public static void main(String[] args) {
        int number = 100002;
        // boolean check = (number > 0) && (number < 11);

        if (1 <= number && number <= 10) {
            System.out.println("Liczba z przedziału 1-10");
        }
        else if (11 <= number && number <= 100) {

            System.out.println("Liczba z przedziału 11-100");
        }
        else if (101 <= number && number <= 1000) {

            System.out.println("Liczba z przedziału 101-1000");
        }
        else if (1001 <= number && number <= 100000) {

            System.out.println("Liczba z przedziału 1001-10000");
        }

        else {
            System.out.println("This is the number from the other range");
        }
    }
}
