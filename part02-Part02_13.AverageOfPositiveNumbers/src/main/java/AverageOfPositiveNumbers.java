
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = 1;
        int totalPositiveNumbers = 0;
        double averageOfPositiveNumbers = 0;

        while (userInput != 0) {

            userInput = Integer.valueOf(scanner.nextLine());

            if (userInput > 0) {
                averageOfPositiveNumbers += (double) userInput;
                totalPositiveNumbers++;
            }
        }

        if (averageOfPositiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(averageOfPositiveNumbers / totalPositiveNumbers);
        }

    }
}
