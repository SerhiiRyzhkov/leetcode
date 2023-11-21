package easy.Task_1816;

// Truncate Sentence
// https://leetcode.com/problems/truncate-sentence/
public class Solution {
    public String truncateSentence(String s, int k) {
        int index=0;

        while ((k>0)&&(index<s.length()))
            if(s.charAt(index++)==' ')k--;


        return s.substring(0,index).trim();
    }
}