package com.jsl.easy.validarentheses;

import java.util.EmptyStackException;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static final Map<Character, Character> parenthese = Map.of('(', ')', '{', '}',
            '[', ']');
    public boolean isValid(String s) {
        boolean result;
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()) {
            if(parenthese.keySet().contains(c)) {
                stack.push(c);
            } else {
                char open;
                try{
                    open = stack.pop();
                } catch (EmptyStackException emptyStackException) {
                    return false;
                }
                if(parenthese.get(open) != c) {
                    return false;
                }
            }
        }
        result = stack.empty();
        return result;
    }
}
