
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> numberList = new ArrayList<>();
        int userInput = 0;
        while (userInput != 9999){
            userInput = Integer.valueOf(scanner.nextLine());
            numberList.add(userInput);
        }
        int smallestNumber = 9999;
        int index = 9999;
        for (int i = 0; i < numberList.size(); i++) {
            if (smallestNumber > numberList.get(i)) {
                smallestNumber = numberList.get(i);
                index = i;
            }
        }
        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Found at index: " + index);
    }
}
