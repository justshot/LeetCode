package com.jsl.easy.romantointeger;

import java.util.Map;

public class Solution {
    public static final Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10,  'L', 50,
            'C',100,  'D', 500,  'M', 1000);

    public static int romanToInt(String s) {
        int result = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(i < charArray.length - 1) {
                if(i < charArray.length - 1 && charArray[i] == 'I' && (charArray[i+1] == 'V' || charArray[i+1] == 'X')) {
                    result -= map.get(charArray[i]);
                    continue;
                }

                if(charArray[i] == 'X' && (charArray[i+1] == 'L' || charArray[i+1] == 'C')) {
                    result -= map.get(charArray[i]);
                    continue;
                }

                if(charArray[i] == 'C' && (charArray[i+1] == 'D' || charArray[i+1] == 'M')) {
                    result -= map.get(charArray[i]);
                    continue;
                }
            }

            result += map.get(charArray[i]);
        }
        return result;
    }
}
