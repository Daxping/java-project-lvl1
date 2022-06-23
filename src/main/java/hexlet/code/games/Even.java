package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = getOneRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static String[] getOneRoundData() {
        int number = Util.getRandomNumber(Util.MIN_VALUE, Util.MAX_VALUE);
        String answer = isEven(number);
        return new String[]{String.valueOf(number), answer};

    }
}
