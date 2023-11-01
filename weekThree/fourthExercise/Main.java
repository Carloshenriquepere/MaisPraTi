package weekThree.fourthExercise;

import weekThree.fourthExercise.designs.Artist;
import weekThree.fourthExercise.shapes.Circle;
import weekThree.fourthExercise.shapes.Square;

public class Main {
    public static void main(String[] args) {

        Artist artist = new Artist();
        Square square = new Square("Red");
        Circle circle = new Circle("yellow");

        artist.createDrawing(square);
        artist.createDrawing(circle);

    }
}
