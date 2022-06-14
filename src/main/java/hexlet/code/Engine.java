package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static String getAnswer() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static int randomNumber() {
        final int max = 100;
        Random random = new Random();
        return random.nextInt(max);
    }
    public static int numberOfRounds() {
        final int numberOfRounds = 3;
        return numberOfRounds;
    }

    public static void gameRounds(String gameDescription, String[][] pair) {
        String userName = greeting();
        System.out.println(gameDescription);
        for (var i = 0; i < numberOfRounds();) {
            System.out.println("Question: " + pair[i][0]);
            String userAnswer = getAnswer();
            String result = userAnswer.equals(pair[i][1]) ? "Correct!"
                    : "'" + userAnswer + "'" + " is wrong answer ;(. "
                    + "Correct answer was " + "'" + pair[i][1] + "'";
            System.out.println(result);

            if (result.equals("Correct!")) {
                i++;
            } else {
                i = numberOfRounds() + 1;
                System.out.println("Let's try again, " + userName + "!");
            }
            if (i == numberOfRounds()) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
