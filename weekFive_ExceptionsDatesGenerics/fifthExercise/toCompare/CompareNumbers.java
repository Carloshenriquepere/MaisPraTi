package weekFive_ExceptionsDatesGenerics.fifthExercise.toCompare;

public class CompareNumbers {

    public static <T extends Number> T comparable(T o1, T o2){

        if (o1.doubleValue() > o2.doubleValue()){
            return o1;
        }else
            return o2;
    }

}
