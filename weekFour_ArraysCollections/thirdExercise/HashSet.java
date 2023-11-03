package weekFour_ArraysCollections.thirdExercise;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

        Set<Integer> number =  new java.util.HashSet<>();

        //Add some numbers to the set, ensuring there are no duplicates.
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(8);
        number.add(5);

        //Print the complete set on screen.
        System.out.println("Print the complete set on screen.");
        System.out.println(number);
        System.out.println("----------------------------------");

        //Check whether a specific number is present in the set.
        System.out.println("Check whether a specific number is present in the set.");
        System.out.println(number.contains(1));
        System.out.println("------------------------------------------");

        //Remove a number from the set.
        number.remove(8);

        //Print the set again to show the change.
        System.out.println("Print the set again to show the change.");
        System.out.println(number);
        System.out.println("-----------------------------------------------");

        //Add more numbers to the set.
        number.add(56);
        number.add(28);
        number.add(15);

        //Create a copy of the original set.
        Set<Integer> number2 = new java.util.HashSet<>(number);
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(5);

        //Use the retainAll() method to keep only the numbers present in the copy of the
        //set.
        number2.retainAll(number);


        //Print the set after the retainAll() operation.
        System.out.println("Print the set after the retainAll() operation.");
        System.out.println(number);
        System.out.println("-------------------------------------------");

        //Clean the set, removing all elements.
        number.removeAll(number);
        number2.removeAll(number2);

        //Print the empty set to confirm.
        System.out.println("Print the empty set to confirm.");
        System.out.println(number);
        System.out.println(number2);
    }
}
