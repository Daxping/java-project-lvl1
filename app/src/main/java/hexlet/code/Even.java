package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void getAnswer() {
        System.out.println("Welcome to the Brain Games!");
        String userName = UserName.getName();
        System.out.println("Hello, " + userName + "!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < 3;) {
            int number = (int) (Math.random() * 100);
            String answer = number % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + number);
            String evenAnswer = sc.nextLine();
            String result = evenAnswer.equals(answer) ? "Correct!" :
                    "'" + evenAnswer + "'" + " is wrong answer ;(. " +
                            "Correct answer was " + "'" + answer + "'";
            System.out.println(result);
            if (result.equals("Correct!")) {
                i++;
            } else {
                i = 4;
            }
            if (i == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
