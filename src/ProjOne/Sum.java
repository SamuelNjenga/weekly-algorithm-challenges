package ProjOne;

public class Sum {

    private static int sum(int n) { //It takes O(n) time and has a space complexity of O(n)
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println(sum(number));
    }
}
