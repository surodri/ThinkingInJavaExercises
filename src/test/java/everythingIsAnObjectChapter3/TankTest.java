package everythingIsAnObjectChapter3;


import everythingInAnObjectChapter3.Tank;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Thoughtworker on 9/2/15.
 */
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
