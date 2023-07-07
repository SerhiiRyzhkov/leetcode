package easy.Task_2418;

import java.util.*;

//  Sort the People
//  https://leetcode.com/problems/sort-the-people/
public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());

        for(int i=0;i<heights.length;i++)
            map.put(heights[i],names[i]);
        return map.values().toArray(new String[0]);
    }
}