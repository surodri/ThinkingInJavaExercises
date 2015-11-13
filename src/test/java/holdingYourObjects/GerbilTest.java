package holdingYourObjects;

import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

/**
 * Created by srodriguez on 11/12/15.
 */
public class GerbilTest {

    @Test
    public void allGerbilsPrintsGerbilNumberOfEach(){
        PrintStream printStream = mock(PrintStream.class); 
        ArrayList<Gerbil> manyGerbils = new ArrayList<Gerbil>();
        manyGerbils.add(new Gerbil(printStream, 4));
        manyGerbils.add(new Gerbil(printStream, 5));
        manyGerbils.add(new Gerbil(printStream, 2));
        manyGerbils.add(new Gerbil(printStream, 0));

        for(int i = 0; i<manyGerbils.size(); i++){
            manyGerbils.get(i).hop();
        }

        InOrder inOrder = inOrder(printStream);
        inOrder.verify(printStream).println(4);
        inOrder.verify(printStream).println(5);
        inOrder.verify(printStream).println(2);
        inOrder.verify(printStream).println(0);
    }
}
