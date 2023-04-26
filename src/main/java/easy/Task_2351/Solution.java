package easy.Task_2351;

import java.util.HashSet;
import java.util.Set;

//  First Letter to Appear Twice
//  https://leetcode.com/problems/first-letter-to-appear-twice/
public class Solution {
    public char repeatedCharacter(String s) {

        char [] array = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for(int i=0; i<array.length; i++)
            if(!set.add(array[i]))return array[i];


        return 'x';
    }
}
