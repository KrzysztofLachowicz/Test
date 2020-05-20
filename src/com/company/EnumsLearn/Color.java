package com.company.EnumsLearn;

public enum Color {

    RED(255, 564, 589),
    WHITE(25, 54, 54),
    BLACK (0, 0, 0);

    private int redColor;
    private int greenColor;
    private int blueColor;

    Color(int redColor, int greenColor, int blueColor) {
        this.redColor = redColor;
        this.greenColor = greenColor;
        this.blueColor = blueColor;
    }
}
