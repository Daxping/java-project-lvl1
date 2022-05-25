package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    public static String getAnswer() {
        final int maxNumber = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        String[] operations = {"+", "-", "*"};
        int a = (int) (Math.random() * maxNumber);
        int b = (int) (Math.random() * maxNumber);
        int indexOfOperation = (int) (Math.random() * operations.length);
        String currentOperation = operations[indexOfOperation];
        int result = switch (currentOperation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> 0;
        };
        System.out.println("Question: " + a + currentOperation + b);
        System.out.print("Your answer: ");
        int calcAnswer = sc.nextInt();
        return calcAnswer == result ? "Correct!"
                : "'" + calcAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + result + "'";
    }
}
