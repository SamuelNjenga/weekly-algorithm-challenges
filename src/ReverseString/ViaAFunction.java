package ReverseString;
//It has a time complexity of O(n)
public class ViaAFunction {
    public  static String hello(String str){
        String reverse = "";
        for(int i = str.length() - 1;i >= 0;i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(hello("Freecode Camp"));
    }
}
