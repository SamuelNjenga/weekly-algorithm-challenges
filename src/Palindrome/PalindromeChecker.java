package Palindrome;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check");
        String original = input.nextLine();
        String reverse = "";
        for(int i = original.length() - 1;i >= 0;i--){
            reverse += original.charAt(i);
        }
        if(original.equals(reverse))
            System.out.println("Entered String is a palindrome");
        else
            System.out.println("Entered String is not a palindrome");
    }
}
