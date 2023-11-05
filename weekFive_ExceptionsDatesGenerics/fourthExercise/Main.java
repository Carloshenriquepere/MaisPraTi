package weekFive_ExceptionsDatesGenerics.fourthExercise;

import weekFive_ExceptionsDatesGenerics.fourthExercise.Stores.Clothing;
import weekFive_ExceptionsDatesGenerics.fourthExercise.Stores.Electronic;
import weekFive_ExceptionsDatesGenerics.fourthExercise.Stores.Food;

public class Main {
    public static void main(String[] args) {

        Electronic electronic = new Electronic();
        Clothing clothing = new Clothing();
        Food food = new Food();

        electronic.insertItem("Not", 23.2);
        electronic.insertItem("Mouse", 24.2);
        electronic.insertItem("TV", 25.2);
        System.out.println(electronic);


        food.insertItem("Xis", 23);
        food.insertItem("Sushi", 100);
        food.insertItem("Found", 59);
        System.out.println(food);

        clothing.insertItem("Calça", 26);
        clothing.insertItem("Camisa", 23);
        clothing.insertItem("Burmuda", 232);
        System.out.println(clothing);
    }
}
