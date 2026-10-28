
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(array));

        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));

        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));

        MainProgram.swap(array, 0, 3);
        System.out.println(Arrays.toString(array));

        MainProgram.sort(array);
        
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            swap(array, indexOfSmallestFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }
    }

    //
    public static void swap(int[] array, int index1, int index2) {
        int supportValue = array[index1];
        array[index1] = array[index2];
        array[index2] = supportValue;
    }

    //
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallestIndex = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    //
    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    //
    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }

        return smallest;
    }
}
