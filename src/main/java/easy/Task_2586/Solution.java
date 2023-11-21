package easy.Task_2586;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Count the Number of Vowel Strings in Range
// https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/
public class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        Set<Character> set = new HashSet<>(List.of('a','e','i','o','u'));

        int count = 0;

        for(int i=left;i<=right;i++)
            if(set.contains(words[i].charAt(0))&&set.contains(words[i].charAt(words[i].length()-1)))count++;
        return count;
    }
}