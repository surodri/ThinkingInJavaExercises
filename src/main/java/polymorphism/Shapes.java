package polymorphism;

import polymorphism.shape.*;



public class Shapes {
    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();

    public static void main(String[] args){
        Shape[] s = new Shape[9];

        //Fill up an array with Shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = randomShapeGenerator.next();

        for(Shape shape : s)
            shape.draw();
    }

}
