package hexlet.code.games;
import hexlet.code.Engine;

public class Gcd {
    public static void runGame() {
        String gameName = "Find the greatest common divisor of given numbers.";
        String[][] pair = new String[Engine.numRound()][2];
        int answer = 1;
        final int max = 100;
        for (var i = 0; i < Engine.numRound(); i++) {
            int a = 1 + (int) (Math.random() * max);
            int b = 1 + (int) (Math.random() * max);
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
