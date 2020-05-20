package com.company.Triangle;

public class Triangle {
    int aA;
    int bB;
    int cC;

    public Triangle(int aA, int bB, int cC) {
        this.aA = aA;
        this.bB = bB;
        this.cC = cC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "aA=" + aA +
                ", bB=" + bB +
                ", cC=" + cC +
                '}';
    }

    public void show() {
        System.out.println(" " + aA + "," + bB + "," + cC + " ");

    }

    public boolean isRectangular() {
        int z = aA * aA + bB * bB;
        int q = cC * cC;
        if (z == q) {
            return true;

        }

        return false;
    }

    public boolean isTriangle() {
        if (aA < (bB + cC) && cC < (aA + bB) && bB < (aA + cC)) {
            return true;
        }
        return false;
    }

    public boolean isEqualiteral() {
        if ((aA == bB) || (aA == cC) || (bB == cC)) {
            return true;
        }
        return false;
    }

    public int sum(){

        int c= aA + bB + cC;
         return c;
    }

}

