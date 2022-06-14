package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    public static void runGame() {

        String gameName = "What number is missing in the progression?";
        String[][] pair = Engine.getArray();
        final int min = 5;
        Random random = new Random();
        for (var i = 0; i < Engine.numRound(); i++) {
            String answer;
            int massiveLength = min + random.nextInt(min * 2);
            int firstNumber = random.nextInt(min * 2);
            int difference = 1 + random.nextInt(min * 2);
            String[] progression = new String[massiveLength];
            progression[0] = String.valueOf(firstNumber);
            for (var x = 1; x < massiveLength; x++) {
                progression[x] = String.valueOf((Integer.parseInt(progression[x - 1])
                        + difference));
            }
            int skip = (int) (Math.random() * massiveLength);
            answer = progression[skip];
            for (var y = 0; y < massiveLength; y++) {
                if (y == skip) {
                    progression[y] = "..";
                }
            }
            String str = String.join(" ", progression);
            pair[i][0] = str;
            pair[i][1] = answer;
        }
        Engine.gameRounds(gameName, pair);
    }
}

