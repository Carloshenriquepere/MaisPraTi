package weekThree.fisrtExercise.vehicles;

public class Car extends Vehicle{

    public int numberOfDoors;
    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nNumber of doors= " + numberOfDoors;
    }
}
