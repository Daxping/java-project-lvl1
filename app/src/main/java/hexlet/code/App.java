package hexlet.code;
public class App {
    public static void main(String[] args) {
        int gameChoice = GameChoice.getChoice();
        if (gameChoice == 1) {
            Greet.greeting();
        }
        if (gameChoice == 2) {
            Even.getAnswer();
        }
    }
}
