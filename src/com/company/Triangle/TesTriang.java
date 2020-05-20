package com.company.Triangle;

public class TesTriang {
    public static void main(String[] args) {
        Triangle trojkat = new Triangle(10, 4, 5);
        Triangle trojkat2 = new Triangle(3, 4, 5);
//trojkat.show();

        System.out.println(trojkat.isRectangular());
        System.out.println(trojkat.isTriangle());
        System.out.println(trojkat.sum ());

    }
}
