
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elips
 */
public class Suitcase {
    private final ArrayList<Item> itemList;
    private final int maximunWeight;
    
    public Suitcase(int maximunWeight){
        this.itemList = new ArrayList<>();
        this.maximunWeight = maximunWeight;
    }

    public void addItem(Item item){
        if(this.maximunWeight >= this.totalWeight() + item.getWeight()){
            this.itemList.add(item);
        }
    }
    
    public void printItems(){
        for(Item i : this.itemList){
            System.out.println(i);
        }
    }
    public int totalWeight(){
        int currentTotalWeight = 0;
        
        for(Item i : this.itemList){
            currentTotalWeight += i.getWeight();
        }
        return currentTotalWeight;
    }
    
    public Item heaviestItem(){
        if(this.itemList.isEmpty()){
            return null;
        }
                
        Item heviestItem = this.itemList.get(0);
        
        for (int i = 1; i < this.itemList.size(); i++) {
            if(heviestItem.getWeight() < this.itemList.get(i).getWeight()){
                heviestItem = this.itemList.get(i);
            }
        }
        
        return heviestItem;
    }
    
    @Override
    public String toString() {
        
        if(this.itemList.isEmpty()){
            return "no items (0 kg)";
        }
        if(this.itemList.size() == 1){
            return "1 item (" + this.itemList.get(0).getWeight() + " kg)";
        }
        
        int numberOfItems = 0;
        int currentTotalWeight = 0;
        
        for(Item i : this.itemList){
            numberOfItems++;
            currentTotalWeight += i.getWeight();
        }
        return numberOfItems + " items (" + currentTotalWeight + " kg)";
    }
    
    
}
