
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        String stars = "";
        for (int i = 0; i < number; i++) {
            stars += "*";
        }
        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String spaces = "";
        for (int i = 0; i < number; i++) {
            spaces += " ";
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int stars = 1;
        for (int i = size; i > 0; i--) {
            printSpaces(i - 1);
            if (size > 0) {
                printStars(stars);
                stars++;
            }
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int stars = 1;
        for (int i = height; i > 0; i--) {
            printSpaces(i - 1);
            if (height > 0) {
                printStars(stars);
                stars += 2;
            }
        }
        final int baseStars = 3;
        final int baseSpaces = height - 2;
        for (int i = 0; i < 2; i++) {
            printSpaces(baseSpaces);
            printStars(baseStars);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
