package easy.Task_1748;


import java.util.HashMap;
import java.util.Map;

//  Sum of Unique Elements
//  https://leetcode.com/problems/sum-of-unique-elements/
public class Solution {
    public int sumOfUnique(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
         for(Integer num:nums)
             map.put(num,map.getOrDefault(num,0)+1);

        return
                map.entrySet().stream().filter(el->el.getValue()==1).mapToInt(Map.Entry::getKey).sum();
    }
}