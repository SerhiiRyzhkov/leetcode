package medium.Task_2150;

import java.util.*;

//Find All Lonely Numbers in the Array
//https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/
public class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums) if(map.containsKey(num))map.put(num,map.get(num)+1); else map.put(num,1);

        for(int n:map.keySet()) if((map.get(n)==1)&&(!map.containsKey(n-1))&&(!map.containsKey(n+1))) result.add(n);

        return result;
    }

}