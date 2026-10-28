
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int thisApartmentSqftPrice = this.pricePerSquare * this.squares;
        int comparedApartmentSqftPrice = compared.pricePerSquare * compared.squares;

        return Math.abs(thisApartmentSqftPrice - comparedApartmentSqftPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisApartmentSqftPrice = this.pricePerSquare * this.squares;
        int comparedApartmentSqftPrice = compared.pricePerSquare * compared.squares;
        
        return thisApartmentSqftPrice > comparedApartmentSqftPrice;
    }
}
