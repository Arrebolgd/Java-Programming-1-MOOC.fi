
public class HealthStation {

    private int numberOfWeighings;
    
    public HealthStation(){
        this.numberOfWeighings = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        int personWeight = person.getWeight();
        this.numberOfWeighings++;
        return personWeight;
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings(){
        return this.numberOfWeighings;
    }
}
