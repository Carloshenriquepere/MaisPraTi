package weekThree.challengeWeekThree;

import weekThree.challengeWeekThree.sales.Resale;
import weekThree.challengeWeekThree.vehicles.Car;
import weekThree.challengeWeekThree.vehicles.Motorcycle;
import weekThree.challengeWeekThree.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle0 = new Car("Etios", "Toyota", "IVV7384", 2014, 30.000, 4);
        Vehicle vehicle1 = new Car("Corolla", "Toyota", "IVV7323", 2000, 45.000, 4);
        Vehicle vehicle2 = new Motorcycle("Biz", "Honda", "IVV0084", 2021, 10.000, "ABS");
        Vehicle vehicle3 = new Car("New Fista", "Ford", "ICC7384", 2015, 38.000, 4);
        Vehicle vehicle4 = new Car("Palio", "Ford", "LVV7384", 2018, 30.000, 2);
        Vehicle vehicle5 = new Car("Creta", "Hinday", "IVC4884", 2023, 100.000, 4);
        Vehicle vehicle6 = new Motorcycle("CB500", "Honda", "DRR5698", 2020, 30.000, "A disco");


        Resale resale = new Resale();

        resale.addVehicle(vehicle0);
        resale.addVehicle(vehicle1);
        resale.addVehicle(vehicle2);
        resale.addVehicle(vehicle3);
        resale.addVehicle(vehicle4);
        resale.addVehicle(vehicle2);
        resale.removeVehicles("IVV7384");

        resale.listVehicle();

        resale.discountForVehicles("IVV0084",0.300);//To get the discount I need to enter '0.' if it is less than a thousand
        resale.discountForVehicles("IVV7323",4.600);






    }
}
