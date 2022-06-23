package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 15;

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = getOneRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    public static int[] getProgression(int massiveLength, int firstNumber, int difference) {
        int[] progression = new int[massiveLength];
        progression[0] = firstNumber;
        for (var i = 1; i < massiveLength; i++) {
            progression[i] = progression[i - 1] + difference;
        }
        return progression;
    }

    public static String getStr(int[] progression, int skip) {
        String str = "";
        String[] strProgression = new String[progression.length];
        for (var i = 0; i < progression.length; i++) {
            strProgression[i] = String.valueOf(progression[i]);
            if (i == skip) {
                strProgression[i] = "..";
            }
            str = String.join(" ", strProgression);
        }
        return str;
    }

    public static String[] getOneRoundData() {
        int massiveLength = Util.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
        int firstNumber = Util.getRandomNumber(Util.MIN_VALUE, MAX_LENGTH);
        int difference = Util.getRandomNumber(Util.MIN_VALUE, MAX_LENGTH);
        int[] progression = getProgression(massiveLength, firstNumber, difference);
        int skip = Util.getRandomNumber(0, progression.length);
        String answer = String.valueOf(progression[skip]);
        String str = getStr(progression, skip);
        return new String[]{str, answer};
    }
}

