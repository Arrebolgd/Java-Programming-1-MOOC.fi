
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Elips
 */
public class UserInterface {

    private JokeManager jokes;
    private Scanner input;

    public UserInterface(JokeManager jokes, Scanner input) {
        this.jokes = jokes;
        this.input = input;
    }

    public void start() {
        LOOP:
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = input.nextLine().toUpperCase();

            switch (command) {
                case "1":
                    this.add();
                    break;
                case "2":
                    System.out.println(this.jokes.drawJoke());
                    break;
                case "3":
                    this.jokes.printJokes();
                    break;
                case "X":
                    break LOOP;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
    public void add(){
        System.out.println("Write the joke to be added:");
        String newJoke = this.input.nextLine();
        this.jokes.addJoke(newJoke);
    }
}
