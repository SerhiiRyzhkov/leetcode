package leet26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
    int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i=1;
        for (int j=1;j<=nums.length-1;j++){
            if(nums[j]!=nums[j-1]){
                nums[i]=nums[j];
                i++;
            }

        }
        return i;
    }
}
