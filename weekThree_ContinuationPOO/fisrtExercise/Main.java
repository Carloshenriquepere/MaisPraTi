package weekThree_ContinuationPOO.fisrtExercise;

import weekThree_ContinuationPOO.fisrtExercise.vehicles.Car;
import weekThree_ContinuationPOO.fisrtExercise.vehicles.Motorcycle;
import weekThree_ContinuationPOO.fisrtExercise.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Toyota", "Etios",2014);
        Car car = new Car("Toyota","Etios",2014,4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CB500",2023,500);


        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(motorcycle);

    }
}
