
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int input = 0;
        int sum = 0;
        int numberOfNumbers = 0;
        int even = 0;
        int odd = 0;
        while (input != -1) {

            input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            numberOfNumbers++;
            sum += input;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        
        double averageOf;
        if(numberOfNumbers == 0){
            averageOf = 0;
        } else {
            averageOf = (double) sum / numberOfNumbers;
        }
        System.out.println("Average: " + averageOf);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
