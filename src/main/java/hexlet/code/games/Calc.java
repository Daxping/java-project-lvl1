package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = getOneRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    public static String[] getOneRoundData() {
        int a = Util.getRandomNumber(Util.MIN_VALUE, Util.MAX_VALUE);
        int b = Util.getRandomNumber(Util.MIN_VALUE, Util.MAX_VALUE);
        int indexOfOperation = Util.getRandomNumber(0, OPERATIONS.length);
        String currentOperation = OPERATIONS[indexOfOperation];
        int answer = switch (currentOperation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new RuntimeException("Unknown operator: " + currentOperation);
        };
        return new String[]{a + " " + currentOperation + " " + b, String.valueOf(answer)};
    }
}
