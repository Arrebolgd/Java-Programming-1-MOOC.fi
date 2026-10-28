
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] splitUserInput = userInput.split(",");
            int newAge = Integer.valueOf(splitUserInput[1]);
            
            oldest = oldest < newAge ? newAge : oldest;
        }
        System.out.println(oldest);
    }
}
