
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();
        if (newCents > 100) {
            newEuros += (newCents / 100);
            newCents = (newCents % 100);
        }
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;

        } else if (this.euros == compared.euros()) {

            if (this.cents < compared.cents()) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decreaser) {

        int newEuros = 0;
        int newCents = 0;
        if(this.euros > decreaser.euros()){
            newEuros = this.euros - decreaser.euros();
        }else if(this.euros < decreaser.euros()){
            return new Money(newEuros, newCents);
        } else {
            newEuros = 0;
        }
        
        if (this.cents > decreaser.cents()) {
            newCents = this.cents - decreaser.cents();

        } else if (this.cents < decreaser.cents() && this.cents != 0) {

            newCents = decreaser.cents() - this.cents;

            if (newEuros == 0) {
                newCents = 0;
            } else {
                newEuros--;
            }
        } else if (this.cents == 0) {
            newCents = 100 - decreaser.cents();

            if (newEuros == 0) {
                newCents = 0;
            } else {
                newEuros--;
            }
        }

        return new Money(newEuros, newCents);

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
