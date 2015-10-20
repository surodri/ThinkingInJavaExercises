package reusingClassesChapter8Test;

import ReusingClassesChapter8.OverloadedMethods;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class OverloadedMethodsTest {

    @Test
    public void shouldCallMessageWithOverloadedMethodMessage() throws Exception {

        PrintStream printStream = mock(PrintStream.class);
        OverloadedMethods overloadedMethods = new OverloadedMethods(printStream);
        String message = "First Overload";

        overloadedMethods.method1(message);

        verify(printStream).println(message);

    }

    @Test
    public void shouldCallMessageWithInt() throws Exception {

        PrintStream printStream = mock(PrintStream.class);
        OverloadedMethods overloadedMethods = new OverloadedMethods(printStream);
        int intParam = 123;

        overloadedMethods.method1(intParam);

        verify(printStream).println(intParam);

    }



}
