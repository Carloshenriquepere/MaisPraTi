package weekTwo.exerciseFour.products;

import weekTwo.exerciseFour.categoriesProducts.CategoryProduct;

public class Product {

    private String name;
    private double price;
    private CategoryProduct category;

    public Product(String name, double price, CategoryProduct category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                " Name = '" + name + '\'' +
                ", Price = " + price +
                ", Category = " + category +
                '}';
    }
}
