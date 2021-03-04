package org.javabasics.controller;
import java.util.Scanner;
import org.javabasics.service.Service;
import org.javabasics.model.Operation;

public class Controller {

    private Service service;

    public Controller() {
        this.service = Service.getInstance();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        Integer number_1 = getUserInput(scanner);
        Integer number_2 = getUserInput(scanner);
        this.service.setNumbers(number_1, number_2);
        do {
            printToConsole();
            userInput = getUserInput(scanner);
            Operation result = this.service.getOperation(userInput);
            if(result != null) {
                System.out.println(result.toString());
            }
        } while(userInput !=0);
    }

    private Integer getUserInput(Scanner scanner) {
        System.out.println("Please enter the a number:");
        return scanner.nextInt();
    }

    private void printToConsole() {
        System.out.println("Enter 1: SUM");
        System.out.println("Enter 2: SUBTRACT");
        System.out.println("Enter 3: MULTIPLY");
        System.out.println("Enter 4: DIVIDE");
        System.out.println("Enter 0: EXIT");
    }

}