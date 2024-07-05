package easy.Task_1356;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

//  Sort Integers by The Number of 1 Bits
//  https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
public class Solution {
    public int[] sortByBits(int[] arr) {
        Integer [] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(array, (o1, o2) -> {
            if(Integer.bitCount(o1)==Integer.bitCount(o2)) return o1.compareTo(o2);
            return Integer.bitCount(o1)-Integer.bitCount(o2);
        });
        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }
}