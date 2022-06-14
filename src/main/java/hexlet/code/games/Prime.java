package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    public static void runGame() {
        String gameName = "Answer 'yes' if the number is prime, otherwise answer 'no'.";
        String[][] pair = new String[Engine.numRound()][2];
        int number;
        int countDivider;

        for (var i = 0; i < Engine.numRound(); i++) {
            number = Engine.randomNumber();
            countDivider = 0;
            for (int x = 1; x <= number; x++) {
                if (number % x == 0) {
                    countDivider++;
                }
            }
            String answer = countDivider == 2 ? "yes" : "no";
            pair[i][0] = String.valueOf(number);
            pair[i][1] = answer;
        }
        Engine.gameRounds(gameName, pair);

    }
}
