/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elips
 */
import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stackList;
    
    public Stack(){
        stackList = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return stackList.isEmpty();
    }
    
    public void add(String value){
        stackList.add(0, value);
    }
    
    public String take(){
        String takenString = stackList.get(0);
        stackList.remove(0);
        return takenString;
    }
    
    public ArrayList<String> values(){
        return stackList;
    }
}
