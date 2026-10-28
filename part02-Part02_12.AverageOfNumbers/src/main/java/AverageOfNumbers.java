
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = 1;
        int totalSum = 0;
        int totalNumbers = 0;
        double average = 0;
        while (userInput != 0) {

            System.out.println("Give a number: ");
            userInput = Integer.valueOf(scanner.nextLine());

            if (userInput != 0) {
                totalSum += userInput;
                totalNumbers++;
            }
        }
        average = (double) totalSum / totalNumbers;
        System.out.println("Average of the numbers: " + average);
    }
}
