package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int numbers[] = new int[]{4, 9, 3, 6, 2};
        for (int i = 0; i < numbers.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min_index]) {
                    min_index = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min_index];
            numbers[min_index] = temp;
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
