package polymorphism;

import polymorphism.shape.*;
import java.io.PrintStream;


public class Shapes {
    private static PrintStream printStream = new PrintStream(System.out);
    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator(System.out);
    
    public static void main(String[] args){
        Shape[] s = new Shape[9];

        //Fill up an array with Shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = randomShapeGenerator.next();

        for(Shape shape : s)
            shape.draw();

        Rectangle rectangle = new Rectangle(System.out);
        rectangle.draw();

        Square square = new Square(System.out);
        square.erase();
    }

}
