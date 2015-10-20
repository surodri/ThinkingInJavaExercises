package everythingIsAnObjectChapter3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EverythingIsAnObjectHelloDataTest {

    @Test
    public void storageShouldReturnDoubleLengthOftheString() {
        EverythingIsAnObjectHelloData everythingIsAnObject = new EverythingIsAnObjectHelloData();

        int size = everythingIsAnObject.storage("size5");
        assertThat(size).isEqualTo(10);
    }
}
