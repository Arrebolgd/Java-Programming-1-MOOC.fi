
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
public class TextUI {

    private Scanner scan;
    private SimpleDictionary dic;

    public TextUI(Scanner scan, SimpleDictionary dic) {
        this.scan = scan;
        this.dic = dic;
    }

    public void start() {
        LOOP:
        while (true) {
            System.out.println("Command:");
            String command = scan.nextLine();

            switch (command) {
                case "add":
                    this.add();
                    break;
                case "search":
                    this.search();
                    break;
                case "end":
                    System.out.println("Bye bye!");
                    break LOOP;
                default:
                    System.out.println("Unknown command");
            }

        }
    }

    public void add() {
        System.out.println("Word:");
        String word = scan.nextLine();

        System.out.println("Translation:");
        String translation = scan.nextLine();

        this.dic.add(word, translation);
    }
    
    public void search(){
        System.out.println("To be translated:");
        String word = scan.nextLine();
        
        if(dic.translate(word) == null){
            System.out.println("Word " + word + " was not found");
        }else{
            System.out.println("Translation: " + dic.translate(word));
        }
    }
}
