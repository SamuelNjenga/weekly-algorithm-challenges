package ProjOne;

public class ReverseArray {
    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] ar = {1, 4, 6, 8, 2, 5};
        reverse(ar);
    }
}
