package com.company.SamouczekTasks.Zadania_sam;

import javax.swing.*;

public class RectangularEx5 {


    public static void main(String[] args) {
        leftTriangle(3, 8);

    }

    private static void leftTriangle(int height, int width) {
        outer:
        for (int i = 0; i < height; i++) {
            if (i > 0) ;
            System.out.println();
            for (int j = 0; j < width; j++) {
                if (j <= width) {
                    System.out.print("*");
                } else {
                    continue outer; //
                }
            }
        }
    }
}




