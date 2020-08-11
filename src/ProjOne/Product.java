package ProjOne;
//Still the runtime is O(n)
public class Product {

    public static void printPairs(int[] array) {
        for (int i= 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
    public static void printUnorderedPairs(int[] array) {
         for (int i= 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                 System.out.println(array[i] + "," + array[j]);
                 }
            }
         }
    public static void main(String[] args) {

        int[] numbers = {12,33,4};
        int sum = 0;
        int product = 1;
        for (int j : numbers){
            sum += j;
        }
        for (int j : numbers){
            product *= j;
        }

        System.out.println("The sum is "+sum);
       // System.out.println("The product is "+product);
//printPairs(numbers);
        printUnorderedPairs(numbers);

    }
}
