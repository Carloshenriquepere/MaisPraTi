package weekTwo.exerciseFourth;

import weekTwo.exerciseFourth.categoriesProducts.CategoryProduct;
import weekTwo.exerciseFourth.products.Product;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Televisão", 5000, CategoryProduct.ELETRONICO);
        Product product1 = new Product("Aveia", 20.0,CategoryProduct.ALIMENTO);
        Product product2 = new Product("Alvejante", 5.0, CategoryProduct.LIMPEZA);
        Product product3 = new Product("Blusão", 200.0,CategoryProduct.VESTUARIO);

        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

    }
}
