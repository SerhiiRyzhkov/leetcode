package easy.Task_1796;

import java.util.*;

//Second Largest Digit in a String
//https://leetcode.com/problems/second-largest-digit-in-a-string/
public class Solution {
    public int secondHighest(String s) {
        Set<Integer> digits = new TreeSet<>();

        for(int i=0;i<s.length();i++)
            if((s.charAt(i)>47)&&(s.charAt(i)<58))digits.add(s.charAt(i)-'0');

        if(digits.size()<2) return -1;

        List<Integer> list = new ArrayList<>(digits);
        Collections.reverse(list);

        return list.get(1);
    }
}
