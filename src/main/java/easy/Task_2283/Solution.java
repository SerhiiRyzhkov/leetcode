package easy.Task_2283;


import java.util.HashMap;
import java.util.Map;

// Check if Number Has Equal Digit Count and Digit Value
// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
public class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();

        for(Character ch: num.toCharArray())
            map.put(Character.getNumericValue(ch),map.getOrDefault(Character.getNumericValue(ch),0)+1);


        for (int i=0;i<num.length();i++) {
            map.putIfAbsent(i, 0);
            if (map.get(i) != Character.getNumericValue(num.charAt(i))) return false;

        }
        return true;
    }
}