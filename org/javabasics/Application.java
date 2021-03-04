package org.javabasics;
import java.util.Scanner;
import org.javabasics.controller.Controller;

public class Application {

    public static void main(String[] args) {

        System.out.println("Welcome to the Java Calculator");
        Controller controller = new Controller();
        controller.start();
    }
}