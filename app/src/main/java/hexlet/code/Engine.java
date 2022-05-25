package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class Engine {
    public static void getAnswer() {
        int choice = GameChoice.getChoice();
        if (!(choice == 0)) {
            System.out.println("Welcome to the Brain Games!");
            String userName = UserName.getName();
            System.out.println("Hello, " + userName + "!");
            final int numberOfRounds = 3; // Число задаваемых вопросов
            for (var i = 0; i < numberOfRounds;) {
                String result = "";
                if (choice == 2) {
                    result = Even.getAnswer();
                }
                if (choice == 3) {
                    result = Calc.getAnswer();
                }
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
}

