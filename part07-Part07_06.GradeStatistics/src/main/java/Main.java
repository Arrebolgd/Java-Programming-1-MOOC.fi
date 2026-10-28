
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int value = Integer.valueOf(scanner.nextLine());

            if (value == -1) {
                break;
            }
            if (value < 0 || value > 100) {
                continue;
            }

            numberList.add(value);
        }

        System.out.println("Point average (all): " + average(numberList));
        System.out.println("Point average (passing): " + averagePassingGrade(numberList));
        System.out.println("Pass percentage: " + passPercentage(numberList));
        gradeDistribution(numberList);
    }

    public static double average(ArrayList<Integer> numberList) {
        double average = 0;
        for (Integer integer : numberList) {
            average += integer.doubleValue();
        }

        return average / (double) numberList.size();
    }

    public static double averagePassingGrade(ArrayList<Integer> numberList) {
        double averagePassing = 0;
        int numberPassing = 0;

        for (Integer integer : numberList) {
            if (integer.intValue() >= 50) {
                averagePassing += integer.doubleValue();
                numberPassing++;
            }
        }

        return averagePassing / (double) numberPassing;
    }

    public static double passPercentage(ArrayList<Integer> numberList) {
        int numberPassing = 0;
        for (Integer integer : numberList) {
            if (integer.intValue() >= 50) {
                numberPassing++;
            }
        }

        return 100 * (double) numberPassing / (double) numberList.size();
    }

    public static void gradeDistribution(ArrayList<Integer> numberList) {
        String failed = "";
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";

        for (Integer integer : numberList) {
            if (integer.intValue() < 50) {
                failed += "*";
            } else if (integer.intValue() < 60) {
                one  += "*";
            } else if (integer.intValue() < 70) {
                two  += "*";
            } else if (integer.intValue() < 80) {
                three  += "*";
            } else if (integer.intValue() < 90) {
                four  += "*";
            } else {
                five += "*";
            }
        }

        System.out.println("Grade distribution:");
        System.out.println("5: " + five);
        System.out.println("4: " + four);
        System.out.println("3: " + three);
        System.out.println("2: " + two);
        System.out.println("1: " + one);
        System.out.println("0: " + failed);
    }
}
