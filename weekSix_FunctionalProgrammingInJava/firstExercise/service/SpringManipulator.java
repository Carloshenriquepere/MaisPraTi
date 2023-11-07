package weekSix_FunctionalProgrammingInJava.firstExercise.service;


import weekSix_FunctionalProgrammingInJava.firstExercise.repositories.SpringOperation;

public class SpringManipulator {

    public SpringOperation twoString = (a, b) -> (a + b);
    public SpringOperation oneString = (a, b)->(a);
}
