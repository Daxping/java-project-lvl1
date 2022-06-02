package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void runGame() {
        System.out.println("Welcome to the Brain Games!");
        String userName = Engine.getUserName();
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        final int numberOfRounds = 3;
        for (var i = 0; i < numberOfRounds;) {
            String result = Engine.prime();
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
