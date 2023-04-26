package easy.Task_922;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Sort Array By Parity II
//https://leetcode.com/problems/sort-array-by-parity-ii/
public class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd = new ArrayList<>();  //NECHET
        List<Integer> even = new ArrayList<>(); //CHET
        for (int num : nums)
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        for(int i=0;i<nums.length;i++)
            if(i%2==0)nums[i]=even.remove(0);
        else nums[i]=odd.remove(0);


        return nums;
    }
}

