package weekThree_ContinuationPOO.thirdExercise.calculators;

public class ScientificCalculator implements Calculator{

    @Override
    public double addition(double a, double b) {
       return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }
    public double squareRoot(double a){
        return Math.sqrt(a);
    }
    public double exponentiation(double base , double exponent){
        return Math.pow(base, exponent);
    }
}
