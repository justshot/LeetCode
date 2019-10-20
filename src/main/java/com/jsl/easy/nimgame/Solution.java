package com.jsl.easy.nimgame;

/**
 * Created by shaoliang.
 */
public class Solution {
    public boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args){
        int n = 10;
        boolean result = new Solution().canWinNim(2);
        System.out.println(n+" can win? "+result);
    }
}
