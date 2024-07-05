package easy.Task_171;

import java.util.HashMap;
import java.util.Map;

// Excel Sheet Column Number
// https://leetcode.com/problems/excel-sheet-column-number/
public class Solution {
    public int titleToNumber(String columnTitle) {
        Map<Character,Integer> map = new HashMap<>();

        int result=0;
        char ch = 'A';
        int count = 1;

        while (ch<='Z')
            map.put(ch++,count++);

        for(int i=0;i<columnTitle.length();i++)
            result+=(map.get(columnTitle.charAt(i)))*Math.pow(26,columnTitle.length()-i-1);


        return result;
    }
}