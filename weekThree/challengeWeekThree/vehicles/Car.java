package weekThree.challengeWeekThree.vehicles;

import weekThree.challengeWeekThree.sales.Promotion;

public class Car extends Vehicle implements Promotion {

    public int numberOfDoors;
    public Car(String model, String brand, String plate, int year, double price, int numberOfDoors) {
        super(model, brand, plate, year, price);
        this.numberOfDoors = numberOfDoors;
    }


    public String displayDetails() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nNumber of doors= " + numberOfDoors;
    }

    @Override
    public void applyDiscount(double value) {
        double discount = this.getPrice() * 0.1;
        if (value <= discount) {
            double newPrice = this.getPrice() - value;
            this.setPrice(newPrice);
            System.out.println("Discount of 10% successfully applied to plate: "+ getPlate() +", the new value is now: " + newPrice);
        } else {
            System.out.println("Discount denied error for plate: "+getPlate()+", The provided discount value is not 10% of the price.");
        }
    }
}
