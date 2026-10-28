
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("")) {
                break;
            }

            String[] splitUserInput = userInput.split(" ");
            int lastPart = splitUserInput.length - 1;
            System.out.println(splitUserInput[lastPart]);
        }
    }
}
