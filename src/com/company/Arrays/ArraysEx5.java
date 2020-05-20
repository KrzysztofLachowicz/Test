package com.company.Arrays;

import java.util.Arrays;

public class ArraysEx5 {

public static void main(String [] args) {
    double[] mainArray = {1.3, 3.4, 4.5, 4.8};

    int mainArrayLength = mainArray.length;


//}
    //public static void calculations (double[] mainArray){

    if (mainArrayLength < 3) {

        System.out.println(mainArray[0]+ "; " + mainArray[1]+ "    ");
        System.out.println("average value=   " + (mainArray[0] + mainArray[1])/2);
    }
    if(mainArrayLength == 3){

        System.out.println(mainArray[0] + "; " + mainArray[1]+ "; " + mainArray[2]);
        System.out.println("average value=   " +(mainArray[0] + mainArray[1]+mainArray[2])/3);
    }
    if (mainArrayLength>3 && mainArrayLength%2==0){
        double average=0;
        for (double value:mainArray) {
            double sum=0;
            sum+=value;
            average = sum/mainArrayLength;
        }
        System.out.println(mainArray[0] + "; " + mainArray[mainArrayLength/2]+ "; "+ mainArray[mainArrayLength/2+1]+ ";  " + mainArray[mainArrayLength-1]);

        System.out.println("Average is=  "+ average);
    }
    if (mainArrayLength>3 && mainArrayLength%2!=0){
        double average=0;
        for (double value:mainArray) {
            double sum=0;
            sum+=value;
            average = sum/mainArrayLength;
        }
        System.out.println(mainArray[0] + "; " + mainArray[mainArrayLength/2]+ "; "+ mainArray[mainArrayLength-1]);
        System.out.println("Average is=  "+ average);
    }
    }

    }