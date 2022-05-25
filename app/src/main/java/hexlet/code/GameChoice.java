package hexlet.code;
import java.util.Scanner;

public class GameChoice {
    public static String getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        String choice = sc.nextLine();
        System.out.println("\n");
        return choice;
    }
}
