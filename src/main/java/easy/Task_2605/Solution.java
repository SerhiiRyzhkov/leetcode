package easy.Task_2605;

import java.util.*;
import java.util.stream.Collectors;

//Form Smallest Number From Two Digit Arrays
//https://leetcode.com/problems/form-smallest-number-from-two-digit-arrays/
public class Solution {
    public int minNumber(int[] nums1, int[] nums2) {

        int min1 = Arrays.stream(nums1).min().getAsInt();
        int min2 = Arrays.stream(nums2).min().getAsInt();

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        set1.retainAll(set2);
        if(set1.size()>0) return set1.stream().mapToInt(el->el).min().getAsInt();
        else return Math.min(min1,min2)*10+Math.max(min1,min2);
    }
}