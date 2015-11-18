package holdingYourObjects;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by srodriguez on 11/18/15.
 */
public class GeneratorTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void nextShouldReturnCharactersInOrderAsInList() throws EmptyListException {

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

    @Test
    public void nextShouldReturnFirstCharacterWhenAtEndOfList() throws EmptyListException {
        List<String> characters = Arrays.asList("Scooby", "Shaggy");
        Generator generator = new Generator(characters);

        generator.next();
        generator.next();
        String loopCharacter = generator.next();

        assertThat(loopCharacter).isEqualTo("Scooby");
    }

    @Test
    public void nextShouldThrowsExceptionWhenEmptyArray() throws EmptyListException {
        List<String> characters = Arrays.asList();

        Generator generator = new Generator(characters);

        exception.expect(EmptyListException.class);
        generator.next();

    }


}
