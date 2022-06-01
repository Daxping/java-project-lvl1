package hexlet.code.games;

import java.util.Scanner;

public class Prime {
    public static String getAnswer() {
        final int maxNumber = 100; // Диапазон случайных чисел от 0 до 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        int number = (int) (Math.random() * maxNumber);
        int countDivider = 0;
        for (var i = 1; i <= number; i++) {
            if (number % i == 0) {
                countDivider++;
            }
        }
        String answer = countDivider <= 2 ? "yes" : "no";
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String primeAnswer = sc.nextLine();
        return primeAnswer.equals(answer) ? "Correct!"
                : "'" + primeAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + answer + "'";
    }
}
