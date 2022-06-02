package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {

    public static void runGameCalc() {
        String userName = Engine.greeting();
        System.out.println("What is the result of the expression?");
        final int numberOfRounds = 3;
        for (var i = 0; i < numberOfRounds;) {
            String result = Engine.calc();
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
