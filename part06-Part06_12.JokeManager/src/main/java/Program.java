
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JokeManager jokeMan = new JokeManager();
        System.out.println("What a joke!");

        UserInterface ui = new UserInterface(jokeMan, scanner);
        
        ui.start();
        
    }
}
