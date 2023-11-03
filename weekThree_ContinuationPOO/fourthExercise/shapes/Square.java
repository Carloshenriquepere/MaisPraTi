package weekThree_ContinuationPOO.fourthExercise.shapes;

public class Square extends Form{
    public Square(String color) {
        super(color);
    }

    @Override
    public void toDesign() {
        System.out.println("Drawing a square: " + super.color);
    }


}
