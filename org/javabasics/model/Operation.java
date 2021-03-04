package org.javabasics.model;

public abstract class Operation {

    protected Integer number_1;
    protected Integer number_2;
    protected Integer result;

    public Integer getResult() {
        return this.result;
    }

    public abstract String getSymbol();

    @Override
    public String toString() {
        return "The result of " +
            this.number_1 +
            getSymbol() +
            this.number_2 +
            " is equal to " + 
            this.result;
    }

}