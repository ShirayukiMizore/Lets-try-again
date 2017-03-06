package Mizore.Utils;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by frost on 3/6/2017.
 */
public class MathHelper {

    public static boolean RandomChance(double chance){
        return ThreadLocalRandom.current().nextDouble(1,100) <= chance;
    }

}
