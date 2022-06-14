package hexlet.code.games;
import hexlet.code.Engine;

public class Gcd {
    public static void runGame() {
        String gameName = "Find the greatest common divisor of given numbers.";
        String[][] pair = new String[Engine.numRound()][2];
        int a;
        int b;
        int answer = 1;
        for (var i = 0; i < Engine.numRound(); i++) {
            a = 1 + Engine.randomNumber();
            b = 1 + Engine.randomNumber();
            for (int x = 1; x <= a && x <= b; x++) {
                if (a % x == 0 && b % x == 0) {
                    answer = x;
                }
            }
            pair[i][0] = a + " " + b;
            pair[i][1] = String.valueOf(answer);
        }
        Engine.gameRounds(gameName, pair);
    }
}
