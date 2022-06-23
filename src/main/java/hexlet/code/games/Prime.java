package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if the number is prime, otherwise answer 'no'.";

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = getOneRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    public static String isPrime(int number) {
        int numOfDivisors = 0;
        for (int x = 1; x <= number; x++) {
            if (number % x == 0) {
                numOfDivisors++;
            }
        }
        return numOfDivisors == 2 ? "yes" : "no";
    }

    public static String[] getOneRoundData() {
        int number = Util.getRandomNumber(Util.MIN_VALUE, Util.MAX_VALUE);
        String answer = isPrime(number);
        return new String[]{String.valueOf(number), answer};
    }
}
