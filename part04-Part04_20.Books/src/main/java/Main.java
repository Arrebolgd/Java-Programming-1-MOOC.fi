import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        
        while(true){
            System.out.println("Title:");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            
            library.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String informationPrinted = scanner.nextLine();
        if(informationPrinted.equals("everything")){
            for(Book b : library){
                System.out.println(b);
            }
        } else if(informationPrinted.equals("name")){
            for(Book b : library){
                System.out.println(b.getTitle());
            }
        }
            
            
            
            
            
            
            
            
    }
}
