package org.lessons.java.vehicles;

import java.time.LocalDate;

public class Car extends Vehicle {
    private int doorNumber;

    public Car(int plate, LocalDate registrationDate, int doorNumber) {
        super(plate, registrationDate);
        this.doorNumber = doorNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "car plate number: "+ super.getPlate()+ " date: " + super.getRegistrationDate()+ " doors: "+ getDoorNumber();
    }
}
