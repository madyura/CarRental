package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static com.company.Main.mainMenu;

public class engine {

    static HashMap<Integer, Car> carArray = new HashMap<>();
    public static Scanner scanner =  new Scanner(System.in);

    public static class Car {
        String manufacturer;
        String model;
        String color;
        int year;

        public Car(String manufacturer, String model, String color, int year) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.color = color;
            this.year = year;
        }

        @Override
        public String toString() {
            return null;
        }

    }

    public static void addNewCar(){
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

            System.out.println(cars.getValue().toString());
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
        carArray.remove(id);
        System.out.println();
        System.out.println("Car is successfully sold!");
        mainMenu();
    }


}
