package org.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String romanNum) {
        int result = 0;

        final Map<Character, Integer> romanMap = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        for (int i = 0; i < romanNum.length(); i++) {
            if (i > 0 && romanMap.get(romanNum.charAt(i)) > romanMap.get(romanNum.charAt(i - 1))) {
                result += romanMap.get(romanNum.charAt(i)) - (2 * romanMap.get(romanNum.charAt(i - 1)));
            } else {
                result += romanMap.get(romanNum.charAt(i));
            }
        }
        return result;
    }
}
