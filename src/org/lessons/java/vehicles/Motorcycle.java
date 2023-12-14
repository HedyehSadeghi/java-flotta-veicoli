package org.lessons.java.vehicles;

import java.time.LocalDate;

public class Motorcycle extends Vehicle {
    private boolean kickStand;

    public Motorcycle(int plate, LocalDate registrationDate, boolean kickStand) {
        super(plate, registrationDate);
        this.kickStand = kickStand;
    }

    public boolean isKickStand() {
        return kickStand;
    }

    public void setKickStand(boolean kickStand) {
        this.kickStand = kickStand;
    }

    @Override
    public String toString() {
        return "motorcycle plate number: "+ super.getPlate()+ " date: " + super.getRegistrationDate()+ "kick-stand: "+ (kickStand? "yes": "no");
    }
}
