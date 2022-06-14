package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void runGame() {
        String gameDescription = "What is the result of the expression?";
        String[][] pair = new String[Engine.numberOfRounds()][2];
        String[] operations = {"+", "-", "*"};
        int a;
        int b;
        int indexOfOperation;
        String currentOperation;
        Random random = new Random();

        for (var i = 0; i < Engine.numberOfRounds(); i++) {
            a = Engine.randomNumber();
            b = Engine.randomNumber();
            indexOfOperation = random.nextInt(operations.length);
            currentOperation = operations[indexOfOperation];
            int answer = switch (currentOperation) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                default -> throw new RuntimeException("Unknown operator: " + currentOperation);
            };
            pair[i][0] = a + " " + currentOperation + " " + b;
            pair[i][1] = String.valueOf(answer);
        }
        Engine.gameRounds(gameDescription, pair);
    }
}
