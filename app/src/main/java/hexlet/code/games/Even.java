package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static String getAnswer() {
        final int maxNumber = 100; // Диапазон случайных чисел от 0 до 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int number = (int) (Math.random() * maxNumber);
        String answer = number % 2 == 0 ? "yes" : "no";
        System.out.println("Question: " + number);
        String evenAnswer = sc.nextLine();
        return evenAnswer.equals(answer) ? "Correct!"
                : "'" + evenAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + answer + "'";
    }
}
