package hexlet.code;

public class Greet {
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        String userName = UserName.getName();
        System.out.println("Hello, " + userName + "!");
    }
}
