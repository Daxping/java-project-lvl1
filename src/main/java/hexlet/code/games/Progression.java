package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 15;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateOneRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static int[] generateProgression(int massiveLength, int firstNumber, int difference) {
        int[] progression = new int[massiveLength];
        progression[0] = firstNumber;
        for (var i = 1; i < massiveLength; i++) {
            progression[i] = progression[i - 1] + difference;
        }
        return progression;
    }

    private static String buildQuestion(int[] progression, int skip) {
        String question = "";
        String[] strProgression = new String[progression.length];
        for (var i = 0; i < progression.length; i++) {
            strProgression[i] = String.valueOf(progression[i]);
            if (i == skip) {
                strProgression[i] = "..";
            }
            question = String.join(" ", strProgression);
        }
        return question;
    }

    private static String[] generateOneRoundData() {
        int massiveLength = Util.generateRandomNumber(MIN_LENGTH, MAX_LENGTH);
        int firstNumber = Util.generateRandomNumber(MIN_VALUE, MAX_VALUE);
        int difference = Util.generateRandomNumber(MIN_VALUE, MAX_VALUE);
        int[] progression = generateProgression(massiveLength, firstNumber, difference);
        int skip = Util.generateRandomNumber(0, progression.length);
        String answer = String.valueOf(progression[skip]);
        String question = buildQuestion(progression, skip);
        return new String[]{question, answer};
    }
}

