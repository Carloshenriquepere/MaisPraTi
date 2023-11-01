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
        if (value == this.getPrice() *0.5){
            double newPrice = this.getPrice() - value;
            this.setPrice(newPrice);
            System.out.println("Discount denied error!");
        }else {
            System.out.println("Discount made successfully, the value is now: " + value);
        }
    }
}
