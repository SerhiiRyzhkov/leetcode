package easy.Task_2185;


import java.util.Arrays;

// Counting Words With a Given Prefix
// https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
public class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for (String w: words)if(w.startsWith(pref))count++;
        return count;
    }
}