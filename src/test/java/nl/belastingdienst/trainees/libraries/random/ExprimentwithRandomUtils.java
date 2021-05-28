package nl.belastingdienst.trainees.libraries.random;

import org.apache.commons.lang3.RandomUtils;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ExprimentwithRandomUtils {
    @Test
    public void RandomNumberTestWithin10() {
        int randomInt = RandomUtils.nextInt(10, 20);
        System.out.println(randomInt);
        Assertions.assertThat(randomInt).isBetween(0,10);
    }
}
