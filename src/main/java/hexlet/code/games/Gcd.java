package hexlet.code.games;

import java.util.Scanner;

public class Gcd {
    public static String getAnswer() {
        final int maxNumber = 100; // Диапазон случайных чисел от 0 до 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        int a = (int) (Math.random() * maxNumber);
        int b = (int) (Math.random() * maxNumber);
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("Question: " + a + " " + b);
        System.out.print("Your answer: ");
        int gcdAnswer = sc.nextInt();

        return gcdAnswer == gcd ? "Correct!"
                : "'" + gcdAnswer + "'" + " is wrong answer ;(. "
                  + "Correct answer was " + "'" + gcd + "'";

    }
}
