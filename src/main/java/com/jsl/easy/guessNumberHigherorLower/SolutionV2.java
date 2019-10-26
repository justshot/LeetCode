package com.jsl.easy.guessNumberHigherorLower;

import java.util.Random;

/**
 * 1. How to init pick
 * 2. How to use java.util.Random
 */
public class SolutionV2 {
    int pick = 0;

    public SolutionV2(int n) {
        this.pick = new Random().nextInt(n) + 1;
        System.out.println("Pick is: " + this.pick);
    }

    private int guess(int num) {
        if (num == pick) return 0;
        else if (num < pick) return -1;
        else return 1;
    }

    public int guessNumber(int n) {
        if (guess(n) == 0) return n;
        int min = 1;
        int max = n;
        int mine = (min + max) / 2;
        int outcome = guess(mine);
        while (outcome != 0) {
            if(outcome > 0) max = mine;
            else min = mine;
            mine = (min + max) / 2;
            outcome = guess(mine);
        }
        return mine;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int n = new Random().nextInt(Integer.MAX_VALUE);
            int outcome = new SolutionV2(n).guessNumber(n);
            System.out.println("Outcome: " + outcome);
        }
    }
}
