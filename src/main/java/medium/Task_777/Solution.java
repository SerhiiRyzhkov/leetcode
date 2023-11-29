package medium.Task_777;

import java.util.*;

// Swap Adjacent in LR String
// https://leetcode.com/problems/swap-adjacent-in-lr-string/
public  class Solution {
    public boolean canTransform(String start, String end) {
        if (!start.replace("X", "").equals(end.replace("X", "")))
            return false;

        int mark1 = 0;
        int mark2 = 0;

        while(mark1 < start.length() && mark2 < end.length()){

            while(mark1 < start.length() && start.charAt(mark1) == 'X')mark1++;
            while(mark2 < end.length() && end.charAt(mark2) == 'X')mark2++;


            if(mark1 == start.length() && mark2 == end.length())return true;

            if(mark1 == start.length() || mark2 == end.length())return false;

            if(start.charAt(mark1) != end.charAt(mark2))return false;

            if(start.charAt(mark1) == 'L' && mark2 > mark1)return false;

            if(start.charAt(mark1) == 'R' && mark1 > mark2)return false;

            mark1++;
            mark2++;
        }
        return true;
    }

}
