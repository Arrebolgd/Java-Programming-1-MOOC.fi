
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//         Experiment with your program here
        
        System.out.println("Edge length?");
        int edge = Integer.valueOf(scanner.nextLine());
        
        Cube newCube = new Cube(edge);
        
        System.out.println(newCube);

    }
}
