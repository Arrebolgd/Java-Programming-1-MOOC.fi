
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        double affordableMeal = 2.50;
        if (card.balance() >= affordableMeal) {
            card.takeMoney(affordableMeal);
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatAffordably(double payment) {
        double affordableMeal = 2.50;
        if (payment == affordableMeal) {
            this.money += affordableMeal;
            this.affordableMeals++;
            return 0;
        }
        if (payment > affordableMeal) {
            this.money += affordableMeal;
            this.affordableMeals++;
            double change = payment - affordableMeal;
            return change;
        }
        return payment;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartyMeals = 4.30;
        if (card.balance() >= heartyMeals) {
            card.takeMoney(heartyMeals);
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        double heartyMeals = 4.30;
        if (payment == heartyMeals) {
            this.money += heartyMeals;
            this.heartyMeals++;
            return 0;
        }
        if (payment > heartyMeals) {
            this.money += heartyMeals;
            this.heartyMeals++;
            double change = payment - heartyMeals;
            return change;
        }
        return payment;
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
