package com.jsl.Reverse_an_integer;

public class Solution {
    static long reverseInteger(int input) {
        String s = Integer.toString(input);
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length/2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        return Long.parseLong(String.valueOf(charArray));
    }

    static long reverseIntegerByArithmetic(int input) {
        long output = 0;
        while(input != 0) {
            int remainder = input % 10;
            output = output * 10 + remainder;
            input = input / 10;
        }
        return output;
    }
}
