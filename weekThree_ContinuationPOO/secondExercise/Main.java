package weekThree_ContinuationPOO.secondExercise;

import weekThree_ContinuationPOO.secondExercise.animals.Cat;
import weekThree_ContinuationPOO.secondExercise.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Boomer", 12);
        Cat cat = new Cat("Amora", 10);
        Dog dog1 = new Dog("Pepe", 20);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(dog1);
    }
}
