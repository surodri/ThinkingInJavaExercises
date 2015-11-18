package holdingYourObjects;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by srodriguez on 11/18/15.
 */
public class GeneratorTest {

    //tests to right
    // list is empty return error
    // index is at end of list, loops to beginning and returns first character
    @Test
    public void nextShouldReturnCharactersInOrderAsInList(){

        List<String> characters = Arrays.asList("thingOne", "thingTwo", "thingThree", "thingFour");
        Generator generator = new Generator(characters);
        String character1 = generator.next();
        String character2 = generator.next();
        String character3 = generator.next();
        String character4 = generator.next();
        assertThat(character1).isEqualTo("thingOne");
        assertThat(character2).isEqualTo("thingTwo");
        assertThat(character3).isEqualTo("thingThree");
        assertThat(character4).isEqualTo("thingFour");
    }
}
