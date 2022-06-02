package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static String getUserName() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static String getAnswer() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static String even() {
        final int max = 100;
        Random random = new Random();
        int number = random.nextInt(max);
        String answer = number % 2 == 0 ? "yes" : "no";
        System.out.println("Question: " + number);
        String userAnswer = getAnswer();
        return userAnswer.equals(answer) ? "Correct!"
                : "'" + userAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + answer + "'";
    }
    public static String calc() {
        final int max = 100;
        Random random = new Random();
        String[] operations = {"+", "-", "*"};
        int a = random.nextInt(max);
        int b = random.nextInt(max);
        int indexOfOperation = random.nextInt(operations.length);
        String currentOperation = operations[indexOfOperation];
        int answer = switch (currentOperation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new RuntimeException("Unknown operator: " + currentOperation);
        };
        System.out.println("Question: " + a + " " + currentOperation + " " + b);
        String userAnswer = getAnswer();
        return userAnswer.equals(Integer.toString(answer)) ? "Correct!"
                : "'" + userAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + answer + "'";
    }
    public static String gcd() {
        final int max = 100;
        Random random = new Random();
        int a = 1 + random.nextInt(max);
        int b = 1 + random.nextInt(max);
        int answer = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                answer = i;
            }
        }
        System.out.println("Question: " + a + " " + b);
        String userAnswer = getAnswer();
        return userAnswer.equals(Integer.toString(answer)) ? "Correct!"
                : "'" + userAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + answer + "'";
    }
    public static String prime() {
        final int max = 100;
        Random random = new Random();
        int number = random.nextInt(max);
        int countDivider = 0;
        for (var i = 1; i <= number; i++) {
            if (number % i == 0) {
                countDivider++;
            }
        }
        String answer = countDivider <= 2 ? "yes" : "no";
        System.out.println("Question: " + number);
        String userAnswer = getAnswer();
        return userAnswer.equals(answer) ? "Correct!"
                : "'" + userAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + answer + "'";
    }
    public static String progression() {
        final int max = 10;
        final int min = 5;
        Random random = new Random();
        int massiveLength = min + random.nextInt(max);
        int firstNumber = random.nextInt(max);
        int difference = 1 + random.nextInt(max);
        String[] progression = new String[massiveLength];
        progression[0] = Integer.toString(firstNumber);
        for (var i = 1; i < massiveLength; i++) {
            progression[i] = Integer.toString((Integer.parseInt(progression[i - 1])
                    + difference));
        }
        String[] strProgression = new String[massiveLength];
        int skip = (int) (Math.random() * massiveLength);
        for (var i = 0; i < massiveLength; i++) {
            if (i != skip) {
                strProgression[i] = progression[i];
            } else {
                strProgression[i] = "..";
            }
        }
        String str = String.join(" ", strProgression);
        System.out.println("Question: " + str);
        String userAnswer = getAnswer();
        return userAnswer.equals(progression[skip]) ? "Correct!"
                : "'" + userAnswer + "'"
                + " is wrong answer ;(. "
                + "Correct answer was " + "'"
                + progression[skip] + "'";
    }
}
