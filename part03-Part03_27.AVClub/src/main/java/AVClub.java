
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            String phrase = scanner.nextLine();
            if(phrase.equals("")){
                break;
            }
            String[] splitPhrase = phrase.split(" ");
            
            for (int i = 0; i < splitPhrase.length; i++) {
                if(splitPhrase[i].contains("av")){
                    System.out.println(splitPhrase[i]);
                }
            }
        }
    }
}
