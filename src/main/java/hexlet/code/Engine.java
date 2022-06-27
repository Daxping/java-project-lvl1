package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void run(String description, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        for (var i = 0; i < roundsData.length; i++) {
            String question = roundsData[i][0];
            String answer = roundsData[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (!userAnswer.equals(answer)) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + answer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
