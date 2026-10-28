
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        String printedArray = "";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                printedArray += (array[i]);
            } else {
                printedArray += (array[i] + ", ");
            }
        }
        System.out.println(printedArray);
    }
}
