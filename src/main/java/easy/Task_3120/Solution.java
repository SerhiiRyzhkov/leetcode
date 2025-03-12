package easy.Task_3120;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

// Count the Number of Special Characters I
// https://leetcode.com/problems/count-the-number-of-special-characters-i/
public class Solution {
    public int numberOfSpecialChars(String word) {
        int result = 0;
        char ch='A'-1;

        while (ch++<='Z')
            result+=(word.indexOf(ch)!=-1&&word.indexOf(ch+32)!=-1)?1:0;

        return result;
    }
}