package easy.Task_2032;

import java.util.*;
import java.util.stream.Collectors;

// Two Out of Three
// https://leetcode.com/problems/two-out-of-three/
public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer,Integer> map = new HashMap<>();

        Arrays.stream(nums1).distinct().forEach(el->map.compute(el,(key,value)->value==null?1:value+1));
        Arrays.stream(nums2).distinct().forEach(el->map.compute(el,(key,value)->value==null?1:value+1));
        Arrays.stream(nums3).distinct().forEach(el->map.compute(el,(key,value)->value==null?1:value+1));

        return map.entrySet().stream().filter(el->el.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());

    }
}