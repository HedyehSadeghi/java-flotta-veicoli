package org.lessons.java.vehicles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Vehicle> vehicleList= new ArrayList<>();
        GestoreFlotta vehicleOrganization= new GestoreFlotta(vehicleList);

        boolean stop= false;
        while (!stop){
            System.out.println("do you want to add a vehicle? (y/n)");
            String choice= scanner.nextLine();
            switch (choice){
                case "y":
                    System.out.println("is it a car (1) or a motorcycle(2)?");
                    String choice1= scanner.nextLine();
                    switch (choice1) {
                        case "1":
                            System.out.print("plate number: ");
                            try {
                                int plateInput= Integer.parseInt(scanner.nextLine());
                                System.out.println("date: (yyyy-mm-dd)");
                                LocalDate dateInput= LocalDate.parse(scanner.nextLine());
                                System.out.println("How many doors: ");
                                int doorInput= Integer.parseInt(scanner.nextLine());
                                Car car= new Car(plateInput,dateInput,doorInput);
                                try {
                                    vehicleOrganization.addVehicle(car);
                                } catch (IllegalArgumentException e){
                                    System.out.println(e.getMessage());
                                }
                            }catch(IllegalArgumentException e){
                                System.out.println(e.getMessage());
                            }
                            break;

                        case "2":
                            System.out.print("plate number: ");
                            try {
                                int plateInput1 = Integer.parseInt(scanner.nextLine());
                                System.out.println("date: (yyyy-mm-dd)");
                                LocalDate dateInput1 = LocalDate.parse(scanner.nextLine());
                                System.out.println("does it have a kick-stand? (y/n)");
                                String kickStandInput = scanner.nextLine();
                                boolean kickStand;
                                if (kickStandInput.equalsIgnoreCase("y")) {
                                    kickStand = true;
                                    Motorcycle motorcycle = new Motorcycle(plateInput1, dateInput1, kickStand);
                                    try {
                                        vehicleList.add(motorcycle);
                                    } catch (IllegalArgumentException e){
                                        System.out.println(e.getMessage());
                                    }
                                } else if (kickStandInput.equalsIgnoreCase("n")) {
                                    kickStand = false;
                                    Motorcycle motorcycle = new Motorcycle(plateInput1, dateInput1, kickStand);
                                    try {
                                        vehicleList.add(motorcycle);
                                    } catch (IllegalArgumentException e){
                                        System.out.println(e.getMessage());
                                    }
                                } else {
                                    System.out.println("invalid choice");
                                }
                            }catch (IllegalArgumentException e){
                                System.out.println(e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("invalid choice, choose 1 or 2");
                            break;
                    }
                    break;
                case "n":
                    System.out.println("ok. this is your list of vehicles: ");
                    System.out.println(vehicleOrganization);
                    stop= true;
                    break;
                default:
                    System.out.println("invalid choice. type y or n");
                    break;
            }
        }

        System.out.println("i chose a car and added it to your list. your new list is:");
        Car car2= new Car(12345,LocalDate.parse("2020-12-12"),4);
        Car car3= new Car(12345,LocalDate.parse("2020-11-13"),2);

        try {
            vehicleOrganization.addVehicle(car2);
            System.out.println(vehicleOrganization);
            System.out.println("in your list there are " + vehicleOrganization.countVehicleTypeCar() + " cars and " + vehicleOrganization.countVehicleTypeMotorcycle() + " motorcycles");

            System.out.println("i can find data through the plate: 12343");
            System.out.println(vehicleOrganization.vehicleInformationsByPlate(12343));
            System.out.println("if you wanna find a vehicle by plate press 1, press anything else to exit");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                System.out.print("type your plate (int): ");
                int plateToLookFor = Integer.parseInt(scanner.nextLine());
                System.out.println(vehicleOrganization.vehicleInformationsByPlate(plateToLookFor));
            } else {
                System.out.println("bye");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }








        scanner.close();
    }
}
