package org.javabasics.model;

public enum Symbol {

    SUM("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String value() {
        return this.symbol;
    }

}