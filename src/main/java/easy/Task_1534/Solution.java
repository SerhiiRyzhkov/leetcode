package easy.Task_1534;


import java.util.*;
import java.util.stream.Collectors;


// Count Good Triplets
// https://leetcode.com/problems/count-good-triplets/
public class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(Math.abs(arr[i]-arr[j])<=a){
                    for(int k=j+1;k<arr.length;k++){
                        if(Math.abs(arr[j]-arr[k])<=b&&Math.abs(arr[i]-arr[k])<=c)
                            result++;
                    }
                }
            }
        }

        return result;
    }
}