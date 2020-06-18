package ReverseString;

import java.util.Scanner;

public class ViaStringBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = input.nextLine();
        StringBuilder builder = new StringBuilder(str);
        System.out.println(builder.reverse());
    }
}
