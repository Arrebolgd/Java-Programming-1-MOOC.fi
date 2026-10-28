
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput;
        int userInputPow;
        while (true) {
            System.out.println("Give a number: ");
            userInput = Integer.valueOf(scanner.nextLine());

            if (userInput < 0) {
                System.out.println("Unsuitable number");
                continue;

            } else if (userInput > 0) {
                userInputPow = (int) Math.pow(userInput, 2);
                System.out.println(userInputPow);
            } else {
                break;
            }

        }
    }
}
