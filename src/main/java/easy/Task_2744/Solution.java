package easy.Task_2744;

import java.util.*;

// Find Maximum Number of String Pairs
// https://leetcode.com/problems/find-maximum-number-of-string-pairs/
public class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int result=0;
        Set<String>set = new HashSet<>();
        for (String word : words)
            if (set.contains(getReverse(word))) result++;
            else set.add(word);

         return result;
    }
    private String getReverse(String w){
        StringBuilder sb = new StringBuilder();
        for(int i=w.length()-1;i>=0;i--)
            sb.append(w.charAt(i));
        return sb.toString();
    }
}