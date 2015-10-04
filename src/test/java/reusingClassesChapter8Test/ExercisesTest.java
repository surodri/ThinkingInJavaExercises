package reusingClassesChapter8Test;

import ReusingClassesChapter8.Exercises;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ExercisesTest {

    PrintStream printStreamMock;

    @Before
    public void setUp(){
        printStreamMock = mock(PrintStream.class);

    }

    @Test
    public void exercise1ShouldInstantiateClassWithLazyInitialization(){

        //Exercise 1: (2) Create a simple class. Inside a second class, define a reference to an object
        //of the first class. Use lazy initialization to instantiate this object.
        //Initializing references before you actually need to use the object

        Exercises exercise1 = new Exercises(printStreamMock);
    }

    @Test
    public void scrubExercise2PrintsOverrideMethodMessage(){

        //Exercise 2: (2) Inherit a new class from class Detergent.
        //Override scrub( ) and add a new method called sterilize( ).

        Exercises exercise2 = new Exercises(printStreamMock);

        exercise2.scrub();

        verify(printStreamMock).println("Overriding Method From Inherited Class");

    }


}
