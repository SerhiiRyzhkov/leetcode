package easy.Task_1859;

import java.util.HashMap;
import java.util.Map;

// Sorting the Sentence
// https://leetcode.com/problems/sorting-the-sentence/
public class Solution {
    public String sortSentence(String s) {
        Map<Integer,String> map = new HashMap<>();
        for(String word: s.split(" "))
            map.put(Character.getNumericValue(word.charAt(word.length()-1)),word.substring(0,word.length()-1));

        StringBuilder sb = new StringBuilder();
        int i=1;

        while (map.containsKey(i)){
            sb.append(map.get(i++)).append(" ");
        }

        return sb.toString().trim();
    }
}