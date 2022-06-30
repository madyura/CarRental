/* TODO
    Improve showAllCars method - if it is empty, should be shown adequate message.
*/


package com.company;

import java.util.Scanner;

import static com.company.Engine.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello and welcome to our car rental company. What is your wish?");
        while (true) {

            mainMenu();
        }

    }
    public static void mainMenu() {
            System.out.println("1. Show all cars");
            System.out.println("2. Add new car");
            System.out.println("3. Sell car");
            System.out.println("4. X for exit");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> showAllCars();
                case "2" -> addNewCar();
                case "3" -> sellCar();
                case "x" -> System.exit(0);
            }
        }








}

