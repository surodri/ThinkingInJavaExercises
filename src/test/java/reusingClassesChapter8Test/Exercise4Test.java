package reusingClassesChapter8Test;

import ReusingClassesChapter8.Exercise4;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class Exercise4Test {

    @Test
    public void baseClassConstructorsShouldBeCalledBeforeDerivedExerciseClass(){

        //Exercise 4: (2) Prove that the base-class constructors
        // are (a) always called and (b) called before derived-class constructors.

        PrintStream printStreamMock = mock(PrintStream.class);
        Exercise4 exercise4 = new Exercise4(printStreamMock);

        verify(printStreamMock).println("Exercise4 constructor");
    }

}
