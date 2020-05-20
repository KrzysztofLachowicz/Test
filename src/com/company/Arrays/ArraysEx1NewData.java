package com.company.Arrays;

public class ArraysEx1NewData {
    private String[][] giveAnimal;

    public ArraysEx1NewData(String[][] giveAnimal) {
        this.giveAnimal = giveAnimal;
    }

    public String[][] getGiveAnimal() {
        return giveAnimal;
    }

    public void showString() {
        for (int subTable = 0; subTable < giveAnimal.length; subTable++) {
            for (int secondSubTable = 0; secondSubTable < giveAnimal[subTable].length; secondSubTable++) {
                System.out.println(giveAnimal[subTable][secondSubTable]);

            }
        }
    }

    public void configureText() {
        String[] colors = giveAnimal[0];
        String[] animals = giveAnimal[1];
        int lenghtColor = colors.length;
        int lenghtAnimals = animals.length;
        int masterLenght = (lenghtColor < lenghtAnimals)? lenghtColor:lenghtAnimals;

        for (int i = 0; i < masterLenght; i++) {

            System.out.println(colors[i] + " " + animals[i]);
        }

    }
}


