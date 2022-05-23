package hexlet.code;
import java.util.Scanner;

public class GameChoice {
    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        int choice = sc.nextInt();
        System.out.println("Your choice: " + choice + "\n");
        return choice;
    }
}
