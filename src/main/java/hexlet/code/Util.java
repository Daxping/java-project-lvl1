package hexlet.code;

import java.util.Random;

public class Util {
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 100;

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max);
    }
}
