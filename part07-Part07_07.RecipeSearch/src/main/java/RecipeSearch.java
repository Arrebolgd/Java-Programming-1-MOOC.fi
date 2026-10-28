
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        // User input
        Scanner scanner = new Scanner(System.in);

        // Recipe collection
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        System.out.println("File to read:");
        String file = scanner.nextLine();
        
        // File reading
        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {

                Recipe singleRecipe = readSingleRecipe(fileScanner);
                
                recipes.add(singleRecipe);

            }

        } catch (IOException ex) {

            System.out.println("Couldn't read the file\n" + ex);
        }
        
        UserInterface ui = new UserInterface(scanner, recipes);
        ui.start();
    }

    public static Recipe readSingleRecipe(Scanner fileScanner) {
        // Recipe parameters for the constructor
        String recipeName = fileScanner.nextLine(); // First line
        int cookingTime = Integer.valueOf(fileScanner.nextLine()); // Second line
        ArrayList<String> ingredients = new ArrayList<>();

        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            
            if(line.trim().isEmpty()){
                break;
            }
            
            ingredients.add(line);
            
        }
        
        return new Recipe(recipeName, cookingTime, ingredients);
    }
}
