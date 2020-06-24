package GreedyAlgorithms;

import java.util.Arrays;
//Time complexity is O(n*n)
public class MarkAndToys {
    private static int maximumToys(int[] prices, int k) {
        int cost = 0;
        int toys = 0;
        Arrays.sort(prices);

        for (int i = 0; i < prices.length; i++) {
            //If current toy fits my budget
            if (cost + prices[i] <= k) {
                toys++;
                cost += prices[i];
            } else {
                break;
            }
        }
        return toys;
    }

    public static void main(String[] args) {
      int[] prices = {4,6,7,8,90,13,4,120,45};
      int myCash = 100;
        System.out.println(maximumToys(prices,myCash));
    }
}
