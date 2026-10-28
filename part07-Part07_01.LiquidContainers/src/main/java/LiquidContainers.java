
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        
        int first = 0;
        int second = 0;
        
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] orders = input.split(" ");
            String command = orders[0];
            int amount = Integer.valueOf(orders[1]);

            switch (command) {

                case "add":
                    if (amount <= 0) {
                        return;
                    }

                    if (first + amount <= 100) {
                        first += amount;
                    } else {
                        first = 100;
                    }
                    break;

                case "move":
                    if (amount <= 0) {
                        return;
                    }

                    if (first - amount >= 0) {
                        first -= amount;
                        second = Math.min(100, second + amount);
                    } else {
                        second = Math.min(100, second + first);
                        first = 0;
                    }
                    break;

                case "remove":
                    second = Math.max(0, second - amount);
                    break;
            }

        }
    }
}
