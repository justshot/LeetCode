package com.jsl.easy.guessNumberHigherorLower;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by shaoliang.
 * https://leetcode.com/problems/guess-number-higher-or-lower/?tab=Description
 */
public class Solution {
    int randomNum = 0;
    int guess(int num){
        if(num < randomNum){
            return 1;
        }else if(num == randomNum){
            return 0;
        }else{
            return -1;
        }
    }

    public int guessNumber (int n){
        this.randomNum = ThreadLocalRandom.current().nextInt(1, n + 1);
        System.out.println("I picked "+randomNum);
        int min=1,max=n+1;
        while(min<max){
            int choose = (max+min)/2;
            int guess = guess(choose);
            if(guess == 0){
                return choose;
            }
            if(guess==1){
                min=choose;
            }else{
                max=choose;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int got = new Solution().guessNumber(1);
        System.out.println("Result "+got);
    }
}
