package reusingClassesChapter8Test;

import ReusingClassesChapter8.C;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;

public class CTest {

    @Test
    public void shouldCallPrintStreamFromConstructors(){
        PrintStream printStream = mock(PrintStream.class);
        C classC = new C(printStream);
    }
}
