package easy.Task_1455;

import java.util.*;

// Check If a Word Occurs As a Prefix of Any Word in a Sentence
// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        int result = -1;

        String [] array = sentence.split(" ");

        for(int i=0;i<array.length;i++)
            if(array[i].startsWith(searchWord)) {result=i+1; break;}

        return result;
    }
}