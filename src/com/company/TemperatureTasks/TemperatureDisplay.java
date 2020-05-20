package com.company.TemperatureTasks;

public class TemperatureDisplay {


    public static void main(String[] args) {
        Temperature now1 = new Temperature(15, "20-01-2020", "20:01");
        showDate(now1);
        showHour(now1);
        showTemperature(now1);
        Temperature now2 = new Temperature(22, "30.06.2020", "18:30");
        showDate(now2);
        showHour(now2);
        showTemperature(now2);

    }

    public static void showTemperature(Temperature tempNew) {

        System.out.println("temperatura wynosi: " + tempNew.getTemperature());
    }

    public static void showDate(Temperature actualDate) {

        System.out.println(" W dniu : " + actualDate.getDate());
    }

    public static void showHour(Temperature hoursNew) {

        System.out.println("o godzinie: " + hoursNew.getHours());
    }

}


