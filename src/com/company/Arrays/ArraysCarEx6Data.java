package com.company.Arrays;


import com.company.CarTasks.Car;

import java.util.Arrays;

public class ArraysCarEx6Data {

    public static void main(String[] args) {
        Car VW = new Car("Passat", "Green", "benzine");
        Car Ford = new Car("Focus", "Black", "diesel");
        Car Honda = new Car("Jazz", "White", "benzine");
        Car Volvo = new Car("850", "Red", "diesel");

        Car[] carTable = {VW, Volvo, Ford, Honda};


        System.out.println(Arrays.toString(carTable));

        Car[] revertTable = revrtTable(carTable);
        System.out.println(Arrays.toString(revertTable));
    }

    /*  public static Car[] revertTable(Car[] cars) {
          Car[] revertedTable = new Car[cars.length];
          for (int i = 0; i < revertedTable.length-1; i++) {

              for (int index = cars.length - 1; index >= 0; index--) {
                  revertedTable[i] = cars[index];

              }

          }
         return revertedTable;
  */
    public static Car[] revrtTable(Car[] cars) {
        Car[] table = new Car[cars.length];

        int index = 0;
        int reverseIndex = table.length - 1;
        while (index < reverseIndex) {
            Car temp = cars[index];
            table[index] = cars[reverseIndex];
            table[reverseIndex] = temp;
            index++;
            reverseIndex--;
        }

        return table;
    }


}
