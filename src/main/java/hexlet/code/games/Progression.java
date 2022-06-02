package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {
    public static void runGameProgression() {
        String userName = Engine.greeting();
        System.out.println("What number is missing in the progression?");
        final int numberOfRounds = 3;
        for (var i = 0; i < numberOfRounds;) {
            String result = Engine.progression();
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

