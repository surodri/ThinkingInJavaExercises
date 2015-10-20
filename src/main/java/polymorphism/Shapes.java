package polymorphism;

import polymorphism.shape.*;

<<<<<<< HEAD
import java.io.PrintStream;


public class Shapes {
    private static PrintStream printStream = new PrintStream(System.out);
    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator(printStream);
=======


public class Shapes {
    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();
>>>>>>> 3aba159c4348c990e7154e2169e267508c343c0d

    public static void main(String[] args){
        Shape[] s = new Shape[9];

        //Fill up an array with Shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = randomShapeGenerator.next();

        for(Shape shape : s)
            shape.draw();
<<<<<<< HEAD

        Rectangle rectangle = new Rectangle(printStream);
        rectangle.draw();

        Square square = new Square(printStream);
        square.erase();
=======
>>>>>>> 3aba159c4348c990e7154e2169e267508c343c0d
    }

}
