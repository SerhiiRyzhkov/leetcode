package easy.Task_953;


import java.util.HashMap;
import java.util.Map;

// Verifying an Alien Dictionary
// https://leetcode.com/problems/verifying-an-alien-dictionary/
public class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<order.length();i++)
            map.put(order.charAt(i),i);

        for(int i=1;i< words.length;i++)
        {
            String word1 = words[i-1];
            String word2 = words[i];
            int min = Math.min(word1.length(), word2.length());
            for(int j = 0; j< min; j++)
            {
                if(map.get(word1.charAt(j))>map.get(word2.charAt(j)))return false;
                if(map.get(word1.charAt(j))<map.get(word2.charAt(j)))break;
                if((j== min -1)&&(word1.length()>word2.length()))return false;
            }
        }

        return true;
    }
}
