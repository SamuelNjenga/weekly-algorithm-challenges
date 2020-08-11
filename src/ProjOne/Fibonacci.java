package ProjOne;

public class Fibonacci {
    private static void allFib(int n) {
         for (int i= 0; i < n; i++) {
            System.out.println(i + ": "+ fib(i));
            }
         }
         private static int fib(int n) {
         if (n <= 0) return 0;
         else if (n == 1) return 1;
         return fib(n - 1) + fib(n - 2);
         }

    static int div(int a, int b) {
        int count = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        allFib(8);
        System.out.println(div(15,3));
    }
}
