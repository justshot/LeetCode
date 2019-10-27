package com.jsl.easy.guessNumberHigherorLower;

import java.util.Random;

/**
 * 1. How to init pick
 * 2. How to use java.util.Random
 */
public class SolutionV2 {
    int pick = 0;

    public SolutionV2(int pick) {
        System.out.println("Pick: " + pick);
        this.pick = pick;
    }

    private int guess(int num) {
        if (num == pick) return 0;
        else if (num < pick) return -1;
        else return 1;
    }

    public int guessNumber(int n) {
        if (guess(n) == 0) return n;
        int min = 1, max = n;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int outcome = guess(mid);
            if(outcome < 0) max = mid - 1;
            else if (outcome > 0 ) min = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int outcome = new SolutionV2(Integer.MAX_VALUE).guessNumber(Integer.MAX_VALUE);
        System.out.println("Outcome: " + outcome);

        outcome = new SolutionV2(1).guessNumber(Integer.MAX_VALUE);
        System.out.println("Outcome: " + outcome);

        outcome = new SolutionV2(1).guessNumber(1);
        System.out.println("Outcome: " + outcome);


        outcome = new SolutionV2(2).guessNumber(2);
        System.out.println("Outcome: " + outcome);

        outcome = new SolutionV2(6).guessNumber(10);
        System.out.println("Outcome: " + outcome);

        outcome = new SolutionV2(new Random().nextInt(Integer.MAX_VALUE) + 1).guessNumber(Integer.MAX_VALUE);
        System.out.println("Outcome: " + outcome);

    }
}
