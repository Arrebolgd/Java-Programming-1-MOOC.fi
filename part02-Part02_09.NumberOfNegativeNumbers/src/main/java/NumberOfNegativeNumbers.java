
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = 1;
        int totalNumbers = 0;
        while (userInput != 0) {

            System.out.println("Give a number: ");
            userInput = Integer.valueOf(scanner.nextLine());

            if (userInput < 0) {
                totalNumbers++;
            }
        }
        System.out.println("Number of negative numbers: " + totalNumbers);
    }
}
