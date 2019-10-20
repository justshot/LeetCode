package com.jsl.easy.maxprofit;

/**
 * Created by shaoliang.
 */
public class MaxProfit {
    public static double getMaxProfit(double[] prices){
        double profit = 0;
        int i=0;
        while(i<prices.length-1){
            int j = i;
            for(;j<prices.length-1 && prices[j]<prices[j+1];j++);
            profit+=prices[j]-prices[i];
            i = j+1;
        }
        return profit;
    }

     public static void main (String[] args){
        double[] prices = {10,8,9,7,8};
        double maxProfit = getMaxProfit(prices);
        System.out.println(maxProfit);
     }
}
