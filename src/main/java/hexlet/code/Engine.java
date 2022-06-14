package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void gameRounds(String gameName, String[][] pair) {
        String userName = getUserName();
        System.out.println(gameName);
        for (var i = 0; i < numRound();) {
            String result = getResult(pair, i);
            System.out.println(result);
            i = iCounter(result, i);
            if (i == numRound() + 1) {
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
    public static String[][] getArray() {
        String[][] pair = new String[Engine.numRound()][2];
        return pair;
    }
    public static String getUserName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static String getAnswer() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static String getResult(String[][] pair, int i) {
        System.out.println("Question: " + pair[i][0]);
        System.out.print("Your answer: ");
        String userAnswer = getAnswer();
        return userAnswer.equals(pair[i][1]) ? "Correct!"
                : "'" + userAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + pair[i][1] + "'";
    }
    public static int iCounter(String result, int i) {
        return result.equals("Correct!") ? i + 1 : numRound() + 1;
    }
}
