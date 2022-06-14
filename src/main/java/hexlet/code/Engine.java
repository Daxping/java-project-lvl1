package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void gameRounds(String gameName, String[][] pair) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc1 = new Scanner(System.in);
        String userName = sc1.nextLine();

        System.out.println(gameName);

        for (var i = 0; i < numRound();) {
            System.out.println("Question: " + pair[i][0]);
            System.out.print("Your answer: ");
            Scanner sc2 = new Scanner(System.in);
            String userAnswer = sc2.nextLine();
            String result = userAnswer.equals(pair[i][1]) ? "Correct!"
                    : "'" + userAnswer + "'" + " is wrong answer ;(. "
                    + "Correct answer was " + "'" + pair[i][1] + "'";
            System.out.println(result);
            if (result.equals("Correct!")) {
                i++;
            } else {
                i = numRound() + 1;
                System.out.println("Let's try again, " + userName + "!");
            }
            if (i == numRound()) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
    public static int randomNumber() {
        final int max = 100;
        Random random = new Random();
        return random.nextInt(max);
    }
    public static int numRound() {
        final int numberOfRounds = 3;
        return numberOfRounds;
    }
}
