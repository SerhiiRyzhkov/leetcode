package main.java.easy.Task_1636;

import java.util.*;

//  Sort Array by Increasing Frequency
//  https://leetcode.com/problems/sort-array-by-increasing-frequency/
public class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
            if (hashmap.containsKey(num)) {
                hashmap.put(num, hashmap.get(num) + 1);
            } else {
                hashmap.put(num, 1);
            }
        }

        Comparator<Integer> comparator = (o1, o2) -> {
            if(hashmap.get(o1)>hashmap.get(o2))return 1;
            else if(hashmap.get(o1)<hashmap.get(o2))return -1;
            else return o2-o1;
        };

        list.sort(comparator);

        int [] result = new int[list.size()];
        for(int i=0;i<result.length;i++)
            result[i]=list.get(i);

        return result;
    }
}
