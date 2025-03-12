package easy.Task_1974;


import java.util.*;

// Minimum Time to Type Word Using Special Typewriter
// https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/description/
public class Solution {
    public int minTimeToType(String word) {
        int result = 0;
        int current = 0;

        for (int i = 0; i < word.length(); i++) {
          int target = word.charAt(i)- 'a';
          int distance = Math.min(Math.abs(target-current),26 - Math.abs(target-current));
          result+=distance+1;
          current=target;
        }

        return result;
    }
}