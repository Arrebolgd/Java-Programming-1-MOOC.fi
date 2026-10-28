
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = 0;
        
        while (userInput != 4) {
            
            System.out.println("Give a number: ");
            
            userInput = Integer.valueOf(scanner.nextLine());
        }
    }
}
