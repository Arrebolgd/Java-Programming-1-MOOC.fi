
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the girft? ");
        double giftCost = Double.valueOf(scan.nextLine());
        double tax;
        if(giftCost >= 5_000 && giftCost <= 25_000){
            tax = 100 + (giftCost - 5_000)*0.08;
            System.out.println("Tax: " + tax);
        }else if(giftCost >= 25_001 && giftCost <= 55_000){
            tax = 1_700 + (giftCost - 25_000)*0.10;
            System.out.println("Tax: " + tax);
        }else if(giftCost >= 55_001 && giftCost <= 200_000){
            tax = 4_700 + (giftCost - 55_000)*0.12;
            System.out.println("Tax: " + tax);
        }else if(giftCost >= 200_001 && giftCost <= 1_000_000){
            tax = 22_100 + (giftCost - 200_000)*0.15;
            System.out.println("Tax: " + tax);
        }else if(giftCost >= 1_000_001){
            tax = 142_100 + (giftCost - 1_000_000)*0.17;
            System.out.println("Tax: " + tax);
        }else{
            System.out.println("No tax!");
        }
    }
}
