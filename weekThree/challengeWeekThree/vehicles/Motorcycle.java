package weekThree.challengeWeekThree.vehicles;

import weekThree.challengeWeekThree.sales.Promotion;

public class Motorcycle extends Vehicle implements Promotion {

    public String brakeType;
    public Motorcycle(String model, String brand, String plate, int year, double price, String brakeType) {
        super(model, brand, plate, year, price);
        this.brakeType = brakeType;
    }


    public String displayDetails() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nBrake Type= " + brakeType;
    }


    @Override
    public void applyDiscount(double value) {
        double discount = this.getPrice() * 0.05;
        if (value <= discount) {
            double newPrice = this.getPrice() - value;
            this.setPrice(newPrice);
            System.out.println("Discount of 10% successfully applied to plate: "+ getPlate() +", the new value is now: " + newPrice);
        } else {
            System.out.println("Discount denied error for plate: "+getPlate()+", The provided discount value is not 10% of the price.");
        }
    }
}
