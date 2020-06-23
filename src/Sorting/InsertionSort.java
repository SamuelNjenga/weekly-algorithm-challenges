package Sorting;
//The time complexity comes to O(n*n)
import java.util.Arrays;

public class InsertionSort {
    private static void print(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        int[] array = {6, 4, 5, 3, 2, 1};
        for (int i = 1; i < array.length; i++) {
            int currValue = array[i];
            int pos = i;
            while (pos > 0 && array[pos - 1] > currValue) {
                array[pos] = array[pos - 1];
                pos = pos - 1;
            }
            array[pos] = currValue;
        }
        print(Arrays.toString(array));
    }
}
