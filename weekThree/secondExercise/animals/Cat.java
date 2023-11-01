package weekThree.secondExercise.animals;

public class Cat extends Pet{

    public Cat(String name, int petAge) {
        super(name, petAge);
    }

    @Override
    public String sound() {
        return "Miau";
    }
}
