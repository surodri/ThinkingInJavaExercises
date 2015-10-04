package reusingClassesChapter8Test;

import ReusingClassesChapter8.Cartoon;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;

public class CartoonTest {

    @Test
    public void shouldCheckVerifyConstructorsAreCalled(){

        //Exercise 4: (2) Prove that the base-class constructors
        // are (a) always called and (b) called before derived-class constructors.

        PrintStream printStream = mock(PrintStream.class);
        Cartoon cartoon = new Cartoon(printStream);
    }

}
