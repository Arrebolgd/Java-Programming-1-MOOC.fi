
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> numbers = new ArrayList<>();
        int userInput = 0;
        
        while(true){
            userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == -1){
                break;
            }
           numbers.add(userInput);
        }
        System.out.println(numbers);
        double sum = 0;
        int index = 0;
        
        for(Integer number : numbers){
            sum += (double) number;
            index++;
            System.out.println(sum + " " + index);
        }
        System.out.println("Average: " + (sum / index));
    }
}
