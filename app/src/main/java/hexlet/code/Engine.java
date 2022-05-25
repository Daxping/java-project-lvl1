package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

public class Engine {
    public static void getAnswer() {
        String choice = GameChoice.getChoice();
        if (choice.equals("1")) {
            Greet.greeting();
        } else {
            if (!(choice.equals("0"))) {
                System.out.println("Welcome to the Brain Games!");
                String userName = UserName.getName();
                System.out.println("Hello, " + userName + "!");
                final int numberOfRounds = 3; // Число задаваемых вопросов
                for (var i = 0; i < numberOfRounds;) {
                    String result = "";
                    if (choice.equals("2")) {
                        result = Even.getAnswer();
                    }
                    if (choice.equals("3")) {
                        result = Calc.getAnswer();
                    }
                    if (choice.equals("4")) {
                        result = Gcd.getAnswer();
                    }
                    System.out.println(result);
                    if (result.equals("Correct!")) {
                        i++;
                    } else {
                        i = numberOfRounds + 1;
                        System.out.println("Let's try again, " + userName + "!");
                    }
                    if (i == numberOfRounds) {
                        System.out.println("Congratulations, " + userName + "!");
                    }
                }
            }
        }
    }
}

