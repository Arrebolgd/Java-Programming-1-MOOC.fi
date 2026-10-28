
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String longestName = "";
        double averageBirth = 0;
        int numberOfCases = 0;
        
        while(true){
            String userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            
            String[] splitUserInput = userInput.split(",");
            
            if(longestName.length() < splitUserInput[0].length()){
                longestName = splitUserInput[0];
            }
            averageBirth += Double.valueOf(splitUserInput[1]);
            numberOfCases++;
        }
        
        System.out.println("Longest name: " + longestName);
        averageBirth /= numberOfCases;
        System.out.println("Average of the birth years: " + averageBirth);
    }
}
