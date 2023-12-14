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
                            int plateInput= Integer.parseInt(scanner.nextLine());
                            System.out.println("date: (yyyy-mm-dd)");
                            LocalDate dateInput= LocalDate.parse(scanner.nextLine());
                            System.out.println("How many doors: ");
                            int doorInput= Integer.parseInt(scanner.nextLine());

                            Car car= new Car(plateInput,dateInput,doorInput);
                            vehicleList.add(car);
                            break;
                        case "2":
                            System.out.print("plate number: ");
                            int plateInput1= Integer.parseInt(scanner.nextLine());
                            System.out.println("date: (yyyy-mm-dd)");
                            LocalDate dateInput1= LocalDate.parse(scanner.nextLine());
                            System.out.println("does it have a kick-stand? (y/n)");
                            String kickStandInput= scanner.nextLine();
                            boolean kickStand;
                            if (kickStandInput.equalsIgnoreCase("y")) {
                                kickStand = true;
                                Motorcycle motorcycle= new Motorcycle(plateInput1,dateInput1,kickStand);
                                vehicleList.add(motorcycle);
                            } else if (kickStandInput.equalsIgnoreCase("n")) {
                                kickStand= false;
                                Motorcycle motorcycle= new Motorcycle(plateInput1,dateInput1,kickStand);
                                vehicleList.add(motorcycle);
                            } else {
                                System.out.println("invalid choice");
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





        scanner.close();
    }
}
