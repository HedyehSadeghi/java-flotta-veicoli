package org.lessons.java.vehicles;

import java.time.LocalDate;

public class Car extends Vehicle {
    private int doorNumber;

    public Car(int plate, LocalDate registrationDate, int doorNumber) {
        super(plate, registrationDate);
        validateDoors(doorNumber);
        this.doorNumber = doorNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) throws  IllegalArgumentException {
        validateDoors(doorNumber);
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "car plate number: "+ super.getPlate()+ " date: " + super.getRegistrationDate()+ " doors: "+ getDoorNumber();
    }

    public void validateDoors(int doors) throws IllegalArgumentException{
        if (doors<=0 || doors>=10){
            throw new IllegalArgumentException("doors must be between 1 and 10");
        }
    }


}
