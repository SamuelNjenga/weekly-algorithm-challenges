package ProjOne;

import java.util.ArrayList;
import java.util.List;

public class Memoize {
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println("Factorial of 3:");
        System.out.println(obj.calculate(3));
        System.out.println("Cache Size" +obj.getMemoizedCache());
        System.out.println("*********");
        System.out.println("*********");
        System.out.println(obj.calculate(4));
        System.out.println(obj.calculate(2));
    }
}

class Factorial {
    private List<Integer> memoizedCache = new ArrayList<>();
    public int calculate(int input) {
        if (input == 0) {
            return 1;
        } else {
            if(memoizedCache.size() >= input){
                System.out.println("Retrieved from cache: "+input);
                return memoizedCache.get(input - 1);
            }
            System.out.println("Calculate for input:"+input);
            int factorial =  input * calculate(input - 1);
            memoizedCache.add(factorial);
            return factorial;
        }

    }

    public List<Integer> getMemoizedCache() {
        return memoizedCache;
    }
}