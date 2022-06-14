package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static void runGame() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] pair = new String[Engine.numberOfRounds()][2];
        int number;
        for (var i = 0; i < Engine.numberOfRounds(); i++) {
            number = Engine.randomNumber();
            String answer = number % 2 == 0 ? "yes" : "no";
            pair[i][0] = String.valueOf(number);
            pair[i][1] = answer;
        }
        Engine.gameRounds(gameDescription, pair);
    }
}
