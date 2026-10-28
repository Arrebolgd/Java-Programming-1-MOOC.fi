/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arrebol
 */
public class Container {

    private int liquidContained;

    public Container() {
        this.liquidContained = 0;
    }

    public int contains() {
        return this.liquidContained;
    }

    public void add(int amount) {
        if (amount <= 0) {
            return;
        }
        this.liquidContained = Math.min(100, this.liquidContained + amount);
    }
    
    public void remove(int amount){
        if(amount <= 0){
            return;
        }
        this.liquidContained = Math.max(0, this.liquidContained - amount);
    }

    @Override
    public String toString() {
        return this.liquidContained + "/100";
    }
    
    
}
