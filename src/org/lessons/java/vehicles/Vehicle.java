package org.lessons.java.vehicles;

import java.time.LocalDate;

public abstract class Vehicle {
    private int plate;
    private LocalDate registrationDate;

    public Vehicle(int plate, LocalDate registrationDate) throws IllegalArgumentException {
        validatePlate(plate);
        this.plate = plate;
        this.registrationDate = registrationDate;
    }

    public int getPlate() {
        return plate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setPlate(int plate) throws IllegalArgumentException {
        validatePlate(plate);
        this.plate = plate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public abstract String toString();

    public void validatePlate(int plate) throws IllegalArgumentException {
        if (plate < 100) {
            throw new IllegalArgumentException("plate must be higher than 100");
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof Vehicle)) {
            return false;
        }
        // cast the object to a Vehicle instance
        Vehicle other = (Vehicle) obj;
        // compare the plate values
        return Integer.valueOf(this.plate).equals(Integer.valueOf(other.plate));
    }

}


