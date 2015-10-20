package polymorphism.referencecounting;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SharedTest {

    PrintStream printStream;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
    }

    @Test
    public void construtorCallsPrintWithCreatingMessage(){
        Shared shared = new Shared(printStream);

        verify(printStream).println("Creating " + shared);
    }

    @Test
    public void addRefIncrementsRefCountByOne(){
        Shared shared = new Shared(printStream);

        shared.addRef();

        assertThat(shared.refcount).isEqualTo(1);
    }

    @Test
    public void disposeDecrementsRefCountByOne(){
        Shared shared = new Shared(printStream);

        shared.dispose();

        assertThat(shared.refcount).isEqualTo(-1);
    }

    @Test
    public void disposeCallsPrintWithDisposinMessage(){
        Shared shared = new Shared(printStream);
        shared.refcount = 1;
        shared.dispose();

        verify(printStream).println("Disposing " + shared);
    }
}
