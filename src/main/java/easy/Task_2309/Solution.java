package easy.Task_2309;


import java.util.HashSet;
import java.util.Set;

//Greatest English Letter in Upper and Lower Case
//https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/
public class Solution {
    public String greatestLetter(String s) {
        Set<Character> upperSet = new HashSet<>();
        Set<Character> lowerSet = new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>64)&&(ch<91))upperSet.add(ch);
            if((ch>96)&&(ch<123))lowerSet.add((char)(ch-32));
        }


        upperSet.retainAll(lowerSet);
        if(upperSet.isEmpty())return "";
        int i = upperSet.stream().mapToInt(el->el).max().getAsInt();

        return String.valueOf((char)(i));
    }
}