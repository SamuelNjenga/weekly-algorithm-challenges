package ProjOne;

public class PairSumSubsequence {
    private static int pairSumSubsequence(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += pairSum(i, i + 1);
        }
        return sum;
    }
    private static int pairSum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println(pairSumSubsequence(number));
    }
}
