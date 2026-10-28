/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arrebol
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationCount;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        observationCount = 0;
    }

    public void birdCount(){
        observationCount++;
    }
    
    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    
    
    @Override
    public String toString() {
        return name + "(" + latinName + "): " + observationCount + " observations";
    }
    
    
}
