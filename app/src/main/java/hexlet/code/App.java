package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        String gameChoice = GameChoice.getChoice();
        switch (gameChoice) {
            case "1" -> Greet.greeting();
            case "2" -> Even.getAnswer();
            case "3" -> Calc.getAnswer();
            default -> {
            }
        }

    }
}
