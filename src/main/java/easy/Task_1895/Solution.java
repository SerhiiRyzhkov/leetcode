package easy.Task_1895;


import java.util.Map;
import java.util.TreeMap;

// Sorting the Sentence
// https://leetcode.com/problems/sorting-the-sentence/
public class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> map = new TreeMap<>();
        String[] arr = s.split(" ");
        for (String value : arr)
            map.put(Integer.parseInt(value.substring(value.length() - 1)), value.substring(0, value.length() - 1));

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Integer, String> m: map.entrySet())
            sb.append(m.getValue()).append(" ");


        return sb.substring(0,sb.length()-1);
    }
}


