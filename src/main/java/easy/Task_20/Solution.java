package easy.Task_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/
public class Solution {
    public boolean isValid(String s) {
       Map<Character, Character> open = new HashMap<>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        Map<Character, Character> close = new HashMap<>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        List<Character> needToBeClosed = new ArrayList<>();

        for(int i=0;i<s.length();i++)
            if(open.containsKey(s.charAt(i)))
                needToBeClosed.add(s.charAt(i));
            else
                if((needToBeClosed.size()>0)&&(needToBeClosed.get(needToBeClosed.size()-1)==close.get(s.charAt(i))))
                    needToBeClosed.remove(needToBeClosed.size()-1);
                else return false;

        return needToBeClosed.isEmpty();
    }
}