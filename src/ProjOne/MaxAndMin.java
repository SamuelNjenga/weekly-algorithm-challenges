package ProjOne;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {12,55,66,77,8,90,900,90};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x : array){
            if(x < min){
                min = x;
            }
            if(x > max){
                max = x;
            }
        }
        System.out.println("Min is "+min);
        System.out.println("Max is "+max);
    }
}
