package hexlet.code.games;
import hexlet.code.Engine;
public class Progression {
    public static void runGame() {
        String gameName = "What number is missing in the progression?";
        String[][] pair = Engine.getArray();

        for (var i = 0; i < Engine.numRound(); i++) {
            String answer;
            String[] progression = getProgression();
            int skip = (int) (Math.random() * progression.length);
            answer = progression[skip];
            String str = getStr(progression, skip);
            pair[i][0] = str;
            pair[i][1] = answer;
        }
        Engine.gameRounds(gameName, pair);
    }
    public static String[] getProgression() {
        final int min = 5;
        int massiveLength = min + (int) (Math.random() * min * 2);
        int firstNumber = (int) (Math.random() * min * 2);
        int difference = 1 + (int) (Math.random() * min * 2);
        String[] progression = new String[massiveLength];
        progression[0] = String.valueOf(firstNumber);
        for (var i = 1; i < massiveLength; i++) {
            progression[i] = String.valueOf((Integer.parseInt(progression[i - 1]) + difference));
        }
        return progression;
    }
    public static String getStr(String[] progression, int skip) {
        String str = "";
        for (var i = 0; i < progression.length; i++) {
            if (i == skip) {
                progression[i] = "..";
            }
            str = String.join(" ", progression);
        }
        return str;
    }
}

