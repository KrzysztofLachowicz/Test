package com.company.TemperatureTasks;

public class TestFarenheitConvert {

    public static void main(String[] args) {
        FahrenheitConverter temp1 = new FahrenheitConverter(212);
        returnCelcius(temp1);
        returnFahrenheit(temp1);
        FahrenheitConverter temp2 = new FahrenheitConverter(0);
        returnCelcius(temp2);
        returnFahrenheit(temp2);

    }

    public static void returnCelcius(FahrenheitConverter dupa) {

        System.out.println("temperatura w st F=  " + dupa.celciusConverter());

    }

    public static void returnFahrenheit(FahrenheitConverter dupa) {

        System.out.println("temperatura w st C=  " + dupa.fahrenheitConverter());

    }


}
