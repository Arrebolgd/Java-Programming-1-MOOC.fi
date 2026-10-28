
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Elips
 */
public class JokeManager {

    private ArrayList<String> jokeList;

    public JokeManager() {
        this.jokeList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokeList.add(joke);
    }

    public String drawJoke() {
        System.out.println("Drawing a joke.");
        if (this.jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random draw = new Random();
        int index = draw.nextInt(this.jokeList.size());
        return this.jokeList.get(index);

    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        for (String s : this.jokeList) {
            System.out.println(s);
        }
    }
}
