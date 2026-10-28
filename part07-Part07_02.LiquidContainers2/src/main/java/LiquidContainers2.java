
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            int amount = Integer.valueOf(splitInput[1]);
            
            switch(command){
                case "add":
                    firstContainer.add(amount);
                    break;
                case "move":
                    if(amount <= firstContainer.contains()){
                        firstContainer.remove(amount);
                        secondContainer.add(amount);
                    } else {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(amount);
                    }
                    
                    break;
                case "remove":
                    secondContainer.remove(amount);
                    break;
            }
            
        }
    }

}
