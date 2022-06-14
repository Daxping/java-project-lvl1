package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    public static void runGame() {

        String gameName = "What number is missing in the progression?";
        String[][] pair = Engine.getArray();
        final int max = 10;
        final int min = 5;
        Random random = new Random();
        int massiveLength;
        int firstNumber;
        int difference;
        for (var i = 0; i < Engine.numRound(); i++) {
            massiveLength = min + random.nextInt(max);
            firstNumber = random.nextInt(max);
            difference = 1 + random.nextInt(max);
            String[] progression = new String[massiveLength];
            progression[0] = Integer.toString(firstNumber);
            for (var x = 1; x < massiveLength; x++) {
                progression[x] = Integer.toString((Integer.parseInt(progression[x - 1])
                        + difference));
            }
            String[] strProgression = new String[massiveLength];
            int skip = (int) (Math.random() * massiveLength);
            for (var y = 0; y < massiveLength; y++) {
                if (y != skip) {
                    strProgression[y] = progression[y];
                } else {
                    strProgression[y] = "..";
                }
            }
            String str = String.join(" ", strProgression);
            String answer = progression[skip];
            pair[i][0] = str;
            pair[i][1] = answer;
        }
        Engine.gameRounds(gameName, pair);
    }
}

