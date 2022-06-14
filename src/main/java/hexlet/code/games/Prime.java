package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    public static void runGame() {
        String gameName = "Answer 'yes' if the number is prime, otherwise answer 'no'.";
        String[][] pair = Engine.getArray();
        for (var i = 0; i < Engine.numRound(); i++) {
            int number = Engine.randomNumber();
            int divider = getDivider(number);
            String answer = divider == 2 ? "yes" : "no";
            pair[i][0] = String.valueOf(number);
            pair[i][1] = answer;
        }
        Engine.gameRounds(gameName, pair);
    }
    public static int getDivider(int number) {
        int countDivider = 0;
        for (int x = 1; x <= number; x++) {
            if (number % x == 0) {
                countDivider++;
            }
        }
        return countDivider;
    }
}
