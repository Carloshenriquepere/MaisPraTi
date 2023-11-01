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
        double discount = this.getPrice() * 0.10; // Calcula o desconto como 10% do preço
        if (discount == this.getPrice() * 0.10) { // Verifica se o desconto é igual a 10%
            double newPrice = this.getPrice() - discount; // Calcula o novo preço com desconto
            this.setPrice(newPrice); // Define o novo preço no veículo
            System.out.println("Discount of 10% applied successfully, the new value is now: " + newPrice);
        } else {
            System.out.println("Discount denied error: The provided discount value is not 10% of the price.");
        }
    }
}
