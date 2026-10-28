
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arrebol
 */
public class UserInterface {

    private Scanner userInput;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner userInput, ArrayList<Recipe> recipes) {
        this.userInput = userInput;
        this.recipes = recipes;
    }

    public void start() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {

            System.out.print("Enter command:");
            String command = this.userInput.nextLine();

            switch (command) {
                case "stop":
                    return;

                case "list":
                    list();
                    break;

                case "find name":
                    System.out.print("Searched word: ");
                    String searchedWord = userInput.nextLine();
                    findName(searchedWord);
                    break;

                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int time = Integer.valueOf(userInput.nextLine());
                    findCookingTime(time);
                    break;

                case "find ingredient":
                    System.out.print("Searched word: ");
                    String searchIngredient = userInput.nextLine();
                    findIngredient(searchIngredient);
                    break;
            }

        }
    }

    public void findIngredient(String searchIngredient){
        ArrayList<String> singleRecipeIngredient;
        
        for (Recipe recipe : recipes) {
            singleRecipeIngredient = recipe.getIngredients();
            if(singleRecipeIngredient.contains(searchIngredient)){
                System.out.println(recipe);
            }
            
        }
    }
    
    public void findCookingTime(int time) {
        
        for (Recipe recipe : this.recipes) {    
            if (recipe.getCookingTime() <= time) {
                
                System.out.println(recipe);
            }
        }

    }

    public void findName(String searchedWord) {
        for (Recipe recipe : this.recipes) {

            if (recipe.getName().toLowerCase().contains(searchedWord)) {
                System.out.println(recipe);
            }
        }

    }

    public void list() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }
}
