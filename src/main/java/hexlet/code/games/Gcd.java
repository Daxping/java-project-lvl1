package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Gcd {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = getOneRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    public static int calculateGCD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    public static String[] getOneRoundData() {
        int a = Util.getRandomNumber(Util.MIN_VALUE, Util.MAX_VALUE);
        int b = Util.getRandomNumber(Util.MIN_VALUE, Util.MAX_VALUE);
        int answer = calculateGCD(a, b);
        return new String[]{a + " " + b, String.valueOf(answer)};
    }
}
