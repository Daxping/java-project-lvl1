package hexlet.code.games;
import hexlet.code.Engine;

public class Gcd {
    public static void runGame() {
        String gameName = "Find the greatest common divisor of given numbers.";
        String[][] pair = Engine.getArray();
        int answer;
        for (var i = 0; i < Engine.numRound(); i++) {
            int a = 1 + Engine.randomNumber();
            int b = 1 + Engine.randomNumber();
            while(a != 0 && b != 0){
                if (a > b) {
                    a = a % b;
                }else{
                    b = b % a;
                }
            }
                    answer = a + b;
            pair[i][0] = a + " " + b;
            pair[i][1] = String.valueOf(answer);
        }
        Engine.gameRounds(gameName, pair);
    }
}
