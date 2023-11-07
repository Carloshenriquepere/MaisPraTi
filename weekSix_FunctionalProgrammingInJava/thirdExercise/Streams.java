package weekSix_FunctionalProgrammingInJava.thirdExercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<Integer> numbersArray = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> evenNumbers = numbersArray.stream()
                .filter(numbers -> numbers % 2 == 1);
        System.out.println("The odd numbers are: " +evenNumbers.toList());
        System.out.println("--------------------------------------");


        List<String> words = Arrays.asList("Java","Lambda","Interface","Function");
        Stream<String> wordUpperCase = words.stream()
                .map(String::toUpperCase);
        System.out.println("Capitalized words: " +wordUpperCase.toList());
        System.out.println("-----------------------------------------");


        Stream.of(5, 10, 15, 20)
                .forEach(numbers -> System.out.println("Printed number: " +numbers));


    }
}
