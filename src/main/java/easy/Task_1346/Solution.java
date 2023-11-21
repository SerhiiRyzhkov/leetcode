package easy.Task_1346;

import java.util.HashSet;
import java.util.Set;

//  Check If N and Its Double Exist
//  https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int j : arr)
            if (set.contains(j * 2) || j%2==0 && set.contains(j / 2)) return true;
            else set.add(j);


        return false;
    }
}