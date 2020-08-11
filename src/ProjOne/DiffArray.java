package ProjOne;

//It has a runtime of O(ab)
public class DiffArray {
    private static void printUnorderedPairs(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.println(arrayA[i] + "," + arrayB[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 6};
        int[] arrayB = {1, 2, 3, 6};
        printUnorderedPairs(arrayA, arrayB);
    }
}
