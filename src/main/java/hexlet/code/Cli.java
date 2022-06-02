package hexlet.code;

public class Cli {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        String userName = Engine.getUserName();
        System.out.println("Hello, " + userName + "!");
    }
}
