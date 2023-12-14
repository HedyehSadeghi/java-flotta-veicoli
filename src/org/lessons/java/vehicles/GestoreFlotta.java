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

    public void addVehicle(Vehicle vehicleToAdd) throws IllegalArgumentException{
        for (Vehicle vehicle: vehicleList) {
            if(vehicle.equals(vehicleToAdd)){
                throw new IllegalArgumentException("can't add this vehicle: plate already existing");
            }
        }
        vehicleList.add(vehicleToAdd);
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

    public String vehicleInformationsByPlate(int plate){
        boolean found= false;
        Vehicle vehicleFound= null;
        for (Vehicle vehicle: vehicleList) {
            if (vehicle.getPlate()==plate){
                found=true;
                vehicleFound= vehicle;
            }
        }
        if (found){
            return vehicleFound.toString();
        }
        else {
            return "no vehicle found with this plate";
        }

    }



    //BONUS: non deve essere possibile aggiungere 2 veicoli con la stessa targa; in questo caso il sistema deve restituire un messaggio di errore
}
