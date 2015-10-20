package polymorphism;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BaseExc10Test {

    @Test
    public void method1CallsMethod2(){

        PrintStream printStream = mock(PrintStream.class);
        BaseExc10 baseExc10 = new BaseExc10(printStream);

        baseExc10.method1();

        verify(printStream).println("method2()");
    }


    @Test
    public void method2CallsPrintWithMethod2Message(){

        PrintStream printStream = mock(PrintStream.class);
        BaseExc10 baseExc10 = new BaseExc10(printStream);

        baseExc10.method2();

        verify(printStream).println("method2()");
    }
}
