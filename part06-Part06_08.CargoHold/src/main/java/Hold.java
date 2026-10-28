
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
public class Hold {

    private ArrayList<Suitcase> suitcaseList;
    private final int maximumWeight;

    public Hold(int maximumWeight) {
        this.suitcaseList = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        for(Suitcase s : this.suitcaseList){
            currentWeight += s.totalWeight();
        }
        
        if (this.maximumWeight >= currentWeight + suitcase.totalWeight()) {
             this.suitcaseList.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase s : this.suitcaseList) {
            s.printItems();
        }
    }

    @Override
    public String toString() {
        if (this.suitcaseList.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        if (this.suitcaseList.size() == 1) {
            return "1 suitcase (" + this.suitcaseList.get(0).totalWeight() + " kg)";
        }

        int suitcases = 0;
        int suitcasesTotalWeight = 0;

        for (Suitcase s : this.suitcaseList) {
            suitcases++;
            suitcasesTotalWeight += s.totalWeight();
        }

        return suitcases + " suitcases (" + suitcasesTotalWeight + " kg)";
    }

}
