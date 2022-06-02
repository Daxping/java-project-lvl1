package hexlet.code.games;
import hexlet.code.Engine;

public class Gcd {
    public static void runGame() {
        Engine.greeting();
        String userName = Engine.getUserName();
        System.out.println("Find the greatest common divisor of given numbers.");
        final int numberOfRounds = 3;
        for (var i = 0; i < numberOfRounds;) {
            String result = Engine.gcd();
            System.out.println(result);
            if (result.equals("Correct!")) {
                i++;
            } else {
                i = numberOfRounds + 1;
                System.out.println("Let's try again, " + userName + "!");
            }
            if (i == numberOfRounds) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
