package weekTwo_IntroductionToPOO.fourthExercise.products;

import weekTwo_IntroductionToPOO.fourthExercise.categoriesProducts.CategoryProduct;

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
