package weekThree.fourthExercise.shapes;

public class Circle extends Form{
    public Circle(String color) {
        super(color);
    }

    @Override
    public void toDesign() {
        System.out.println("Drawing a circle: " + super.color);
    }


}
