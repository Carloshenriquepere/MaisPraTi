package weekSix_FunctionalProgrammingInJava.secondExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functions {
    public static void main(String[] args) {


        List<Integer> numbersArray = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbersArray.stream()
                .filter(numbers -> numbers % 2 == 0)
                .toList();
        System.out.println("The even numbers are: " +evenNumbers);
        System.out.println("--------------------------------------");



        List<String> words = Arrays.asList("Java","Lambda","Interface","Function");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .toList();
        System.out.println("Each word has: " +wordLengths);
        System.out.println("-----------------------------------------");


        Stream.of("Caroline", "Alice", "Eduardo")
                .forEach(letter -> System.out.println("Hello " + letter));

    }
}
