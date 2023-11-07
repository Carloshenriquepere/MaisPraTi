package weekSix_FunctionalProgrammingInJava.firstExercise;


import weekSix_FunctionalProgrammingInJava.firstExercise.service.SpringManipulator;

public class Main {
    public static void main(String[] args) {

        SpringManipulator springManipulator = new SpringManipulator();

        System.out.println(springManipulator.twoString.name("Carlos ","Henrique"));
        System.out.println(springManipulator.oneString.name("Eduardo", "Soares"));
    }
}
