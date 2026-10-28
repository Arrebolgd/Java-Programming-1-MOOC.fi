
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean onGoing = true;
        String userInput;
        while(onGoing){
            System.out.println("Shall we carry on?");
            userInput = scanner.nextLine();
            if(userInput.equals("no")){
                onGoing = false;
            }
        }
    }
}
