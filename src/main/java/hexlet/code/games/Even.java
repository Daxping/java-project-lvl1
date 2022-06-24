package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateOneRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String[] generateOneRoundData() {
        int number = Util.generateRandomNumber(MIN_VALUE, MAX_VALUE);
        String answer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), answer};

    }
}
