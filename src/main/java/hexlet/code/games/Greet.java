package hexlet.code.games;

import hexlet.code.Engine;
public class Greet {
    public static void greeting() {
        String userName = Engine.getUserName();
        System.out.println("Hello, " + userName + "!");
    }
}
