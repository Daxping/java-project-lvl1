package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static void runGame() {
        String gameName = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] pair = Engine.getArray();
        int number;
        for (var i = 0; i < Engine.numRound(); i++) {
            number = Engine.randomNumber();
            String answer = number % 2 == 0 ? "yes" : "no";
            pair[i][0] = String.valueOf(number);
            pair[i][1] = answer;
        }
        Engine.gameRounds(gameName, pair);
    }
}
