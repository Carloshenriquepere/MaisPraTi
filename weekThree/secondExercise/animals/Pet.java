package weekThree.secondExercise.animals;

abstract public class Pet {

    protected String name;
    protected int petAge;

    public Pet(String name, int petAge) {
        this.name = name;
        this.petAge = petAge;
    }
    abstract String sound();

    @Override
    public String toString() {
        return "Name= " + name + " - PetAge= " + petAge + " - Sound= " + sound();

    }
}
