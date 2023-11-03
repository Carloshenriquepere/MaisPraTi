package weekThree_ContinuationPOO.challengeWeekThree.vehicles;

import weekThree_ContinuationPOO.challengeWeekThree.sales.Promotion;

abstract public class Vehicle implements Promotion {

    private String model;
    private String brand;
    private String plate;
    private int year;
    private double price;

    public Vehicle(String model, String brand, String plate, int year, double price) {
        this.model = model;
        this.brand = brand;
        this.plate = plate;
        this.year = year;
        this.price = price;
    }

    public String displayDetails(String model, String brand, String plate, int year, double price){
       return displayDetails(model, brand, plate, year, price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "\nModel= " + model +
                ",\nBrand= " + brand +
                ",\nPlate= " + plate +
                ",\nYear= " + year +
                ",\nPrice= " + price +
                '}';
    }

}
