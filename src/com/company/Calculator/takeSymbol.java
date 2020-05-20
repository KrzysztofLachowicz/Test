package com.company.Calculator;

public enum takeSymbol {
    PLUS ("+"),
    MINUS("-"),
    DEVIDE("/"),
    MULTIPLY("*"),
    ;

    private String symbol;

    takeSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

