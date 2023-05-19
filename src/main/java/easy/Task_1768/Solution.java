package easy.Task_1768;

import java.util.ArrayList;
import java.util.List;

//Merge Strings Alternately
//https://leetcode.com/problems/merge-strings-alternately/
public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<Math.max(word1.length(),word2.length());i++){
            if(word1.length()>i)stringBuilder.append(word1.charAt(i));
            if(word2.length()>i)stringBuilder.append(word2.charAt(i));
        }
        return stringBuilder.toString();
    }
}