/**
 * Created by anthonybelen on 2/14/16.
 */
public class Client {

    public static void main(String[] args) {

        // print all the enum values
        for (Object obj : GameConsole.values()) {
            System.out.println(obj);
        }

        // test the fromString method.
        GameConsole gameConsole = GameConsole.fromString("GENESIS");
        System.out.println(gameConsole);
    }
}