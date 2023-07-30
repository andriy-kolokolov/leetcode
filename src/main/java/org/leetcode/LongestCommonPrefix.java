package org.leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Find the shortest string in the array
        String shortest = strs[0];
        for (String s : strs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }

        // Check each character in the shortest string to see if it's in all the strings
        for (int i = 0; i < shortest.length(); i++) {
            char c = shortest.charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != c) {
                    return shortest.substring(0, i);
                }
            }
        }

        // If we made it through the loop, then the shortest string is the common prefix
        return shortest;
    }
}
