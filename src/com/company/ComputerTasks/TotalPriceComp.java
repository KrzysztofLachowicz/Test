package com.company.ComputerTasks;

import com.company.ComputerTasks.ComputerPrice;

public class TotalPriceComp {


    public static void main(String[] args) {
        ComputerPrice comp1 = new ComputerPrice(250, 450, 400, 550, 2500);
        displayPrice(comp1);
        ComputerPrice comp2 = new ComputerPrice(3500, 4500, 2100, 1500, 7500);
        displayPrice(comp2);
    }

    public static void displayPrice(ComputerPrice fuck1) {


        System.out.println("Cena zestawu komputerowego: " + fuck1.getCompPrice() + "zł");

        System.out.println("Cena stacji roboczej: " + fuck1.getDisplayPrice() + "zł");

        System.out.println("Cena moniotra: " + fuck1.getWholeCompPrice() + "zł");
    }
}

