package com.company.EnumsLearn;

public enum Operation {
  PLUS("+"),
  MINUS("-"),
  MULTIPLY("*"),
  DEVIDE("/");

  private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return  symbol;
    }
public double clacultate (double a, double b){

        double result = 0.0;

        switch (symbol){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a/b;
                break;
        }
return result;



}
}