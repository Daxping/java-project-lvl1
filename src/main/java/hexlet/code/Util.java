package hexlet.code;

import java.util.Random;

public class Util {

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max);
    }
}
