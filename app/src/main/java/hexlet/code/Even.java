package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void getAnswer() {
        System.out.println("Welcome to the Brain Games!");
        String userName = UserName.getName();
        System.out.println("Hello, " + userName + "!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int numOfQuestions = 2 + 1; // Число задаваемых вопросов
        int maxNumber = (2 * 2 * 2 * 2 * 2 * 2 * 2); // Диапазон случайных чисел от 0 до 128
        for (var i = 0; i < numOfQuestions;) {
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
                i = numOfQuestions + 1;
            }
            if (i == numOfQuestions) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
