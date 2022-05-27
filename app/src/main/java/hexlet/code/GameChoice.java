
package hexlet.code;
import java.util.Scanner;

public class GameChoice {
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
}
