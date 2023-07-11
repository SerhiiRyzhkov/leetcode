package easy.Task_35;

import java.util.HashMap;
import java.util.Map;

// Search Insert Position
// https://leetcode.com/problems/search-insert-position/
public class Solution {
    public int searchInsert(int[] nums, int target) {

        int first =0;
        int last = nums.length-1;
        int middle = (first+last)/2;


        while (first<=last){
            if(nums[middle]==target) return middle;
            else if (nums[middle]<target){
                first=middle+1;
                middle=(first+last)/2;
            }
            else {
                last=middle-1;
                middle=(first+last)/2;
            }

        }

        return Math.max(first,last);

    }

}