package everythingIsAnObjectChapter3;

import everythingInAnObjectChapter3.EverythingIsAnObjectHelloData;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Thoughtworker on 8/31/15.
 */
public class EverythingIsAnObjectHelloDataTest {

    @Test
    public void storageShouldReturnDoubleLengthOftheString() {
        EverythingIsAnObjectHelloData everythingIsAnObject = new EverythingIsAnObjectHelloData();

        int size = everythingIsAnObject.storage("size5");
        assertThat(size).isEqualTo(10);
    }
}
