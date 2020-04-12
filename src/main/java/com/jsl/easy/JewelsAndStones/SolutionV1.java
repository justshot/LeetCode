package com.jsl.easy.JewelsAndStones;

public class SolutionV1 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char c_j: J.toCharArray()) {
            for (char c_s: S.toCharArray()) {
                if(c_j==c_s) count++;
            }
        }
        return count;
    }
}
