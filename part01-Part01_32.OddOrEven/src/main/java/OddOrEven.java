
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give the number: ");
        int number = Integer.valueOf(scan.nextLine());
        
        boolean isEven = false;
        if((double)number % 2 == 0){
            isEven = true;
        }
        if(isEven){
            System.out.println("Number " + number + " is even.");
        }else{
            System.out.println("Number " + number + " is odd.");
        }
    }
}
