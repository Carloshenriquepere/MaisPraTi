package weekThree_ContinuationPOO.fisrtExercise.vehicles;

public class Motorcycle extends Vehicle{

    public int cylinderCapacity;

    public Motorcycle(String brand, String model, int year, int cylinderCapacity) {
        super(brand, model, year);
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nCylinder Capacity= " + cylinderCapacity;

    }
}
