
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        while(true){
            System.out.println("Name:");
            userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            
            items.add(new Item(userInput));
        }
        for(Item i : items){
            System.out.println(i);
        }
    }
}
