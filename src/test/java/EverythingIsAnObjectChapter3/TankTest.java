package everythingIsAnObjectChapter3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TankTest {

    @Test
    public void testEmptiedShouldSetFillTankToFalseWhenGivenTrue(){
        Tank tank = new Tank(true);
        tank.emptied(true);

        assertThat(tank.fillTank).isEqualTo(false);
    }

    @Test
    public void testEmptiedShouldSetFillTankToTrueWhenGivenFalse(){
        Tank tank = new Tank(true);
        tank.emptied(false);

        assertThat(tank.fillTank).isEqualTo(true);
    }



}
