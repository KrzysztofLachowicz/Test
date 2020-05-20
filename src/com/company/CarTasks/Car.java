package com.company.CarTasks;

public class Car {
    String brand = "ford";
    String color;
    String engine;


    public Car(String brand, String color, String engine) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}

