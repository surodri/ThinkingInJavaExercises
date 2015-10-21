package interfacesChapter10;

import interfacesChapter10.adapterPatternEx11.Ex11;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Ex11Test {

    @Test
    public void swapShouldSwapEachPairOfCharactersGivenString(){

        Ex11 ex11 =  new Ex11();

        String result = ex11.swap("asdf");

        assertThat(result).isEqualTo("safd");

    }
}
