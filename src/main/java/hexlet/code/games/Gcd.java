package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Gcd {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateOneRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static int calculateGCD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    private static String[] generateOneRoundData() {
        int a = Util.getRandomNumber(MIN_VALUE, MAX_VALUE);
        int b = Util.getRandomNumber(MIN_VALUE, MAX_VALUE);
        int answer = calculateGCD(a, b);
        return new String[]{a + " " + b, String.valueOf(answer)};
    }
}
