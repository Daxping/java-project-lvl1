package hexlet.code.games;

import hexlet.code.UserName;

import java.util.Scanner;

public class Calc {
    public static void getAnswer() {
        System.out.println("Welcome to the Brain Games!");
        String userName = UserName.getName();
        System.out.println("Hello, " + userName + "!");
        final int numberOfRounds = 3;
        final int maxNumber = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        for (var i = 0; i < numberOfRounds;) {
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
            String res = calcAnswer == result ? "Correct!"
                    : "'" + calcAnswer + "'" + " is wrong answer ;(. "
                    + "Correct answer was " + "'" + result + "'";
            System.out.println(res);
            if (res.equals("Correct!")) {
                i++;
            } else {
                i = numberOfRounds + 1;
            }
            if (i == numberOfRounds) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
