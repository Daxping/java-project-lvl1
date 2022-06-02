package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static String getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        String choice = sc.nextLine();
        System.out.println("\n");
        return choice;
    }
    public static void runGame() {
        String choice = getChoice();
        switch (choice) {
            case "1" -> Cli.greet();
            case "2" -> Even.runGame();
            case "3" -> Calc.runGame();
            case "4" -> Gcd.runGame();
            case "5" -> Progression.runGame();
            case "6" -> Prime.runGame();
            default -> throw new RuntimeException("There is no game with this number " + choice);
        }
    }
    public static void main(String[] args) {
        runGame();
    }
}

