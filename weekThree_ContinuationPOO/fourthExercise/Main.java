package weekThree_ContinuationPOO.fourthExercise;

import weekThree_ContinuationPOO.fourthExercise.designs.Artist;
import weekThree_ContinuationPOO.fourthExercise.shapes.Circle;
import weekThree_ContinuationPOO.fourthExercise.shapes.Square;

public class Main {
    public static void main(String[] args) {

        Artist artist = new Artist();
        Square square = new Square("Red");
        Circle circle = new Circle("yellow");

        artist.createDrawing(square);
        artist.createDrawing(circle);

    }
}
