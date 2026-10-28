
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dic = new SimpleDictionary();
        
        TextUI textUI = new TextUI(scanner, dic);
        
        textUI.start();
        System.out.println(dic.translate("Hola"));
    }
}
