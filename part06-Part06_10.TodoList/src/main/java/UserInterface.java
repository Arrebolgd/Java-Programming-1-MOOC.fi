
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
    private TodoList tdList;
    private Scanner scan;
    
    public UserInterface(TodoList tdList, Scanner scan){
        this.tdList = tdList;
        this.scan = scan;
    }
    
    public void start(){
        LOOP:
        while(true){
            System.out.println("Command:");
            String command = scan.nextLine();
            
            switch(command){
                case "stop":
                    break LOOP;
                case "add":
                    System.out.println("To add:");
                    String task = this.scan.nextLine();
                    this.tdList.add(task);
                    break;
                case "list":
                    this.tdList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?:");
                    int remove = Integer.valueOf(this.scan.nextLine());
                    this.tdList.remove(remove);
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
    
    
}
