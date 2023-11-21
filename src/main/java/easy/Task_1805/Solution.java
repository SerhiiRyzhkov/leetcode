package easy.Task_1805;

import java.util.*;

// Number of Different Integers in a String
// https://leetcode.com/problems/number-of-different-integers-in-a-string/
public class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<word.length();i++)
            if (word.charAt(i) > 47 && word.charAt(i) < 58)
                sb.append(word.charAt(i));
            else sb.append(" ");


        Arrays.stream(sb.toString().split(" "))
                .filter(s -> !s.isEmpty())
                .forEach(el->set.add(zeroCut(el)));

        return set.size();
    }

    private String zeroCut(String s){
        int i=0;
        while (s.charAt(i)=='0') {
            i++;
            if (i >= s.length()) return "0";
        }
        return s.substring(i);
    }
}