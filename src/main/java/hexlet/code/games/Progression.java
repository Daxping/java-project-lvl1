package hexlet.code.games;

import java.util.Scanner;
import java.util.Arrays;

public class Progression {
    public static String getAnswer() {
        final int minNumber = 5;
        final int maxNumber = 10;
        int massiveLength = (int) (minNumber + Math.random() * maxNumber);
        Scanner sc = new Scanner(System.in);
        int firstNumber = (int) (Math.random() * maxNumber);
        int difference = (int) (1 + Math.random() * maxNumber); // Минимальное значение разности прогрессии = 1
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
        System.out.println("Question: " + Arrays.toString(strProgression));
        System.out.print("Your answer: ");
        String progressionAnswer = sc.nextLine();
        return progressionAnswer.equals(progression[skip]) ? "Correct!"
                : "'" + progressionAnswer + "'"
                + " is wrong answer ;(. "
                + "Correct answer was " + "'"
                + progression[skip] + "'";
    }
}
