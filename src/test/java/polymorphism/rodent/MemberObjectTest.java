package polymorphism.rodent;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MemberObjectTest {

    @Test
    public void attackCallsPrintWithSelfMessage(){
        PrintStream printStream = mock(PrintStream.class);
        MemberObject member = new MemberObject(printStream);

        verify(printStream).println("MemberObject()");
    }

}
