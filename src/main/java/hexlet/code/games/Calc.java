package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATIONS = {'+', '-', '*'};
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateOneRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static String[] generateOneRoundData() {
        int a = Util.generateRandomNumber(MIN_VALUE, MAX_VALUE);
        int b = Util.generateRandomNumber(MIN_VALUE, MAX_VALUE);
        int indexOfOperation = Util.generateRandomNumber(0, OPERATIONS.length);
        char currentOperation = OPERATIONS[indexOfOperation];
        int answer = calculate(a, b, currentOperation);
        return new String[]{a + " " + currentOperation + " " + b, String.valueOf(answer)};
    }

    private static int calculate(int number1, int number2, char operation) {
        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new RuntimeException("Unknown operator: " + operation);
        };
    }
}
