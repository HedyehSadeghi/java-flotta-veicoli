package org.lessons.java.vehicles;

import java.time.LocalDate;

public abstract class Vehicle {
    private int plate;
    private LocalDate registrationDate;

    public Vehicle(int plate, LocalDate registrationDate) {
        this.plate = plate;
        this.registrationDate = registrationDate;
    }

    public int getPlate() {
        return plate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public abstract String toString();
}
