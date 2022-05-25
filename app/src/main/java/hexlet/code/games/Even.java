package hexlet.code.games;
import hexlet.code.UserName;

import java.util.Scanner;

public class Even {
    public static void getAnswer() {
        System.out.println("Welcome to the Brain Games!");
        String userName = UserName.getName();
        System.out.println("Hello, " + userName + "!");
        final int numberOfRounds = 3; // Число задаваемых вопросов
        final int maxNumber = 100; // Диапазон случайных чисел от 0 до 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < numberOfRounds;) {
            int number = (int) (Math.random() * maxNumber);
            String answer = number % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + number);
            String evenAnswer = sc.nextLine();
            String result = evenAnswer.equals(answer) ? "Correct!"
                    : "'" + evenAnswer + "'" + " is wrong answer ;(. "
                    + "Correct answer was " + "'" + answer + "'";
            System.out.println(result);
            if (result.equals("Correct!")) {
                i++;
            } else {
                i = numberOfRounds + 1;
            }
            if (i == numberOfRounds) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
