package NaturalNumbers;

public class SumOfNaturalNumbers {

    //Formula approach with a time complexity of O(1)
    private static int sum(int n){
        return (n * (n + 1)) / 2;
    }

    //Loop approach with a time complexity of O(n)
//    private static int sum(int n){
//        int s = 0;
//        for(int i = 1; i<= n;i++){
//            s += i;
//        }
//        return s;
//    }

    //Recursive approach with a time complexity of O(n)
//    private static int sum(int n){
//        if(n == 0){
//            return 0;
//        }
//        return sum(n - 1) + n;
//    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(sum(number));
    }
}
