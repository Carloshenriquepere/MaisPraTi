package weekSix_FunctionalProgrammingInJava.fourthExercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvancedStream {
    public static void main(String[] args) {

        Map<String, Integer> map = Stream.of("Eduardo", "Alice", "Caroline", "Carlos")
                .collect(Collectors.toMap(k -> k, v ->v.length()));
        System.out.println("Size of names are: " +map);
        System.out.println("---------------------------------------------------");

        Map<String, List<Integer>> evenOrOdd = Stream
                .of(1,2,3,4,5,6,7,8,9,10)
                .collect(Collectors.groupingBy(numbers -> numbers % 2 == 0 ? "Even" : "Odd"));
        System.out.println(evenOrOdd);
        System.out.println("---------------------------------------------------");

        List<String> order =  Stream.of("Apple", "Banana", "Apple", "Orange", "Banana").distinct().sorted().toList();
        System.out.println(order);
    }
}
