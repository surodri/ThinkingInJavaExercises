package accessControlChapter7;

import acessControlChapter7.debug.AcessControlIdenticalClass;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;

public class AcessControlIdenticalClassTest {
    @Test
    public void debugCallsPrintStreamGivenAnString(){
        PrintStream printMock = mock(PrintStream.class);
        AcessControlIdenticalClass exercise3 = new AcessControlIdenticalClass(printMock);

        exercise3.debug("I am debugging");
    }
}
