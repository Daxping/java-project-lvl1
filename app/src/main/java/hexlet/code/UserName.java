package hexlet.code;
import java.util.Scanner;
public class UserName {
    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        return sc.nextLine();
    }
}
