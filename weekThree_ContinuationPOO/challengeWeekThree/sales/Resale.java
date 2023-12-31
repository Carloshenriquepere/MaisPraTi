package weekThree_ContinuationPOO.challengeWeekThree.sales;

import weekThree_ContinuationPOO.challengeWeekThree.vehicles.Vehicle;

public class Resale {

    public Vehicle[] vehicles = new Vehicle[5];
    public int vehicleCount = 0;

    public void addVehicle(Vehicle vehicle){

        if (vehicleCount < 5) {
            vehicles[vehicleCount] = vehicle;
            vehicleCount++;
        }else {
            System.out.println("Full resale, " + vehicle.getPlate() + " unable to register!");
            System.out.println("-------------------------------------------------------");
        }
    }
    public void removeVehicles(String plate){
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i] != null && vehicles[i].getPlate().equals(plate)) {

                for (int j = i; j < vehicleCount - 1; j++) {
                    vehicles[j] = vehicles[j + 1];
                }
                vehicles[vehicleCount - 1] = null;
                vehicleCount--;
                System.out.println("Vehicle with plate " + plate + " removed.");
                System.out.println("------------------------------------------");
                return;
            }
        }
        System.out.println("Vehicle with plate " + plate + " not found.");
        System.out.println("-----------------------------------------------");
    }

    public void listVehicle(){
        System.out.println("List of Registered Vehicles:");
        for (int i = 0; i < vehicleCount; i++) {
            Vehicle vehicle = vehicles[i];
            if (vehicle != null) {
                System.out.println("Model: " + vehicle.getModel());
                System.out.println("Brand: " + vehicle.getBrand());
                System.out.println("Plate: " + vehicle.getPlate());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Price" + vehicle.getPrice());
                System.out.println("---------------------");
            }
        }

    }
    public void discountForVehicles(String plate, double valueDiscount){
        for (int i = 0; i < vehicleCount; i++) {
            Vehicle vehicle = vehicles[i];
            if (vehicle != null && vehicle.getPlate().equals(plate)) {
                vehicle.applyDiscount(valueDiscount);
                return;
            }
        }
    }
}
