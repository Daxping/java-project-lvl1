package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void run(String description, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println(description);
        for (var i = 0; i < ROUNDS_COUNT;) {
            System.out.println("Question: " + roundsData[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();
            String result =  userAnswer.equals(roundsData[i][1]) ? "Correct!"
                    : "'" + userAnswer + "'" + " is wrong answer ;(. "
                    + "Correct answer was " + "'" + roundsData[i][1] + "'";
            System.out.println(result);
            if (!result.equals("Correct!")) {
                System.out.println("Let's try again, " + userName + "!");
                break;
            } else {
                i++;
            }
            if (i == ROUNDS_COUNT) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
        sc.close();
    }
}
