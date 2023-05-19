package easy.Task_392;

import java.util.ArrayList;
import java.util.List;

//Is Subsequence
//https://leetcode.com/problems/is-subsequence/
public class Solution {
    public boolean isSubsequence(String s, String t) {
        List<Character> list = new ArrayList<>();
        for(char ch:s.toCharArray()) list.add(ch);
        int index=0;
        while ((!list.isEmpty())&&(index<t.length()))
        {
            if((t.charAt(index++))==list.get(0))list.remove(0);
        }

        return list.size()==0;
    }
}
