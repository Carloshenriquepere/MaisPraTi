package weekThree.fisrtExercise.vehicles;

public class Vehicle {

    public String brand;
    public String model;
    public int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String getLastClassNamePart() {
        String fullClassName = getClass().getName();
        int lastDotIndex = fullClassName.lastIndexOf('.');
        if (lastDotIndex != -1) {
            return fullClassName.substring(lastDotIndex + 1);
        } else {
            return fullClassName;
        }
    }

    @Override
    public String toString() {
        return "--------Information " +getLastClassNamePart() + "-----------"+
                "\nBrand= " + brand +
                ",\nModel= " + model +
                ",\nYear= " + year;
    }
}
