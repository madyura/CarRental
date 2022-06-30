/* TODO
    Узнать, как вывести в консоль объект Car.
    Сейчас выводится только внутренняя кодировка объекта по типу: com.company.engine$Car@4e50df2e
*/


package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static com.company.engine.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello and welcome to our car rental company. What is your wish?");
        while (true){

            mainMenu();
        }

    }
    public static void mainMenu(){
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

