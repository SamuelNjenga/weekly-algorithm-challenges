package Sorting;

public class P {

    private static int power(int a,int b){
        int power  = a;
        for(int i = 2; i <= b;i++){
            power *= a;
        }
        return power;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(power(4,1));
    }
}
