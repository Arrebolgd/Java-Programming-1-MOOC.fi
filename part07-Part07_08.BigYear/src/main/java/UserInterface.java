
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arrebol
 */
public class UserInterface {

    private Scanner scanner;
    private ArrayList<Bird> birdList;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdList = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            System.out.flush();
            String command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "quit":
                    return;

                case "add":
                    birdList.add(addBird());
                    break;

                case "observation":
                    observation();
                    break;

                case "all":
                    all();
                    break;

                case "one":
                    one();
                    break;
                    
                default:
                    break;
            }
        }
    }

    public Bird addBird() {

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();

        return new Bird(name, latinName);
    }

    public void observation() {
        System.out.print("Bird?");
        String observedBird = scanner.nextLine();

        for (Bird bird : birdList) {
            if (bird.getName().equalsIgnoreCase(observedBird)
                    || bird.getLatinName().equalsIgnoreCase(observedBird)) {

                bird.birdCount();
                return;
            }
        }
        System.out.println("Not a bird! ");
    }

    public void all() {
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }

    public void one() {
        System.out.println("Bird? ");
        String birdName = scanner.nextLine();

        for (Bird bird : birdList) {
            if (bird.getName().equalsIgnoreCase(birdName)
                    || bird.getLatinName().equalsIgnoreCase(birdName)) {

                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird! ");
    }
}
