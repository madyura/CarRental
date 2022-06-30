package com.company;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import static com.company.Main.mainMenu;

public class Engine {

    static HashMap<Integer, Car> carArray = new HashMap<>();
    public static Scanner scanner =  new Scanner(System.in);

    public static class Car {
        String manufacturer;
        String model;
        String color;
        int year;

        public String getManufacturer() {
            return manufacturer;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getYear() {
            return year;
        }

        public Car(String manufacturer, String model, String color, int year) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.color = color;
            this.year = year;
        }


    }

    public static void addNewCar() {
        System.out.println();
        System.out.println("Add new car menu");
        System.out.println("Enter car ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter car manufacturer: ");
        String manufacturer = scanner.next();
        System.out.println("Enter car model: ");
        String model = scanner.next();
        System.out.println("Enter color: ");
        String color = scanner.next();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        carArray.put(id, new Car(manufacturer, model, color, year));
        System.out.println("Car is added!");
        System.out.println();
        mainMenu();
    }

    public static void showAllCars() {
        System.out.println();
        System.out.println("Show all cars menu");
        System.out.println();
        for (Map.Entry<Integer, Car> cars : carArray.entrySet()){

            System.out.print(cars.getValue().getManufacturer() + ", ");
            System.out.print(cars.getValue().getModel() + ", ");
            System.out.print(cars.getValue().getColor() + ", ");
            System.out.println(cars.getValue().getYear() + ".");
        }
        System.out.println();
        mainMenu();
    }

    public static void sellCar() {
        System.out.println();
        System.out.println("Sell car menu");
        System.out.println();
        System.out.println("Enter car id:");
        int id = scanner.nextInt();
        boolean foundItem = false;
        for (Map.Entry<Integer, Car> cars : carArray.entrySet()){
                if (id == cars.getKey()){
                    carArray.remove(id);
                    System.out.println("Car is successfully sold!");
                    foundItem = true;
                    break;
                }
        }
        if (!foundItem){
            System.out.println("This ID does not belong to any car");
        }
        System.out.println();
        mainMenu();
    }
}
