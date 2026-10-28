
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestName = "";
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] splitUserInput = userInput.split(",");
            int newAge = Integer.valueOf(splitUserInput[1]);
            
           if(oldest < newAge){
               oldest = newAge;
               oldestName = splitUserInput[0];
           }
            
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
