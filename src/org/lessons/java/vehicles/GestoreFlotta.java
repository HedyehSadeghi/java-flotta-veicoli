package org.lessons.java.vehicles;

import java.util.ArrayList;

public class GestoreFlotta {

    private ArrayList<Vehicle> vehicleList;

    public GestoreFlotta(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public int countVehicleTypeCar(){
        int counterCars=0;
        for (Vehicle vehicle: vehicleList) {
            if (vehicle instanceof Car){
                counterCars++;
            }
        }
        return counterCars;
    }

    public int countVehicleTypeMotorcycle(){
        return vehicleList.size()-countVehicleTypeCar();
    }

    @Override
    public String toString() {
        String string= "";
        for (Vehicle vehicle: vehicleList) {
            string += vehicle.toString()+"\n";
        }
        return string;
    }


//trovare un veicolo specifico tramite il numero di targa
    //BONUS: non deve essere possibile aggiungere 2 veicoli con la stessa targa; in questo caso il sistema deve restituire un messaggio di errore
}
