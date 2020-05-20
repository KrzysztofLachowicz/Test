package com.company.TemperatureTasks;



public class Temperature {
    double temperature;
    String date;
    String hours;

    public Temperature(double temperature, String date, String hours) {
        this.temperature = temperature;
        this.date = date;
        this.hours = hours;
    }

    public double getTemperature() {
                return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
}
