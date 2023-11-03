package weekThree_ContinuationPOO.secondExercise.animals;

public class Dog extends Pet{

    public Dog(String name, int petAge) {
        super(name, petAge);
    }

    @Override
    public String sound() {
        return "Au, Au";
    }
}
