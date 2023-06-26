package easy.Task_2154;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Keep Multiplying Found Values by Two
// https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/
public class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean found =false;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==original){found=true;break;}
        if(found){
            original*=2;
            original=findFinalValue(nums,original);
        }
        return original;    }
}