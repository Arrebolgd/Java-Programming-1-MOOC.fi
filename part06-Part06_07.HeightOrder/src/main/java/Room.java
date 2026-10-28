
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
public class Room {

    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public boolean isEmpty() {
        return this.personList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.personList;
    }

    public Person shortest() {
        if (this.personList.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.personList.get(0);
        
        for (int i = 1; i < this.personList.size(); i++) {
            if (shortestPerson.getHeight() > this.personList.get(i).getHeight()) {
                shortestPerson = this.personList.get(i);
            }
        }
        return shortestPerson;
    }
    
    public Person take(){
        Person shortestPerson = this.shortest();
        
        // When this function .remove() is used, it returns true or false
        // a null value just return false without throwing any errors, bypassing the need for an if statement.
        this.personList.remove(shortestPerson);
        
        return shortestPerson;
    }
}
