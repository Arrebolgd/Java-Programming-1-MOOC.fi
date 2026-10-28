import java.util.ArrayList;
import java.util.Scanner;
import jdk.internal.org.jline.terminal.TerminalBuilder;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Name:");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Duration:");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));
            
        }
        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram tp : programs){
            if(tp.getDuration() <= maxDuration){
                System.out.println(tp);
            }
        }
    }
}
