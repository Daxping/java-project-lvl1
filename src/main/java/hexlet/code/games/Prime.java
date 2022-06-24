package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if the number is prime, otherwise answer 'no'.";
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateOneRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static boolean isPrime(int number) {
        int numOfDivisors = 0;
        for (int x = 1; x <= number; x++) {
            if (number % x == 0) {
                numOfDivisors++;
            }
        }
        return numOfDivisors == 2;
    }

    private static String[] generateOneRoundData() {
        int number = Util.generateRandomNumber(MIN_VALUE, MAX_VALUE);
        String answer = isPrime(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), answer};
    }
}
