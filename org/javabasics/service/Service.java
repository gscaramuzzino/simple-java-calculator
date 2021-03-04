package org.javabasics.service;
import org.javabasics.model.*;

public class Service {

    private Integer number_1;
    private Integer number_2;

    private static Service service;

    private Service() {}

    public static Service getInstance() {
        if(service == null) {
            service = new Service();
        }
        return service;
    }

    public void setNumbers(Integer number_1, Integer number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    public Operation getOperation(int input) {
        switch(input) {
            case 1:
                return new Sum(this.number_1, this.number_2);
            case 2:
                return new Subtract(this.number_1, this.number_2);
            case 3:
                return new Multiply(this.number_1, this.number_2);
            case 4:
                return new Divide(this.number_1, this.number_2);
        }
        return null;
    }
}