package medium.Task_2405;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Optimal Partition of String
//https://leetcode.com/problems/optimal-partition-of-string/
public class Solution {
    public int partitionString(String s) {
        List<StringBuilder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if (sb.toString().contains(String.valueOf(s.charAt(i)))) {
                list.add(sb);
                sb = new StringBuilder();
                sb.append(s.charAt(i));
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        list.add(sb);
        return list.size();
    }
}