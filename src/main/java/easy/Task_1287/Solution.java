package easy.Task_1287;

//  Element Appearing More Than 25% In Sorted Array
//  https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
public class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=1;
        int current=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]==current)count++;
            else {
                current=arr[i];
                count=1;
            }
            if(count>arr.length/4)return current;
        }
        return current;
    }
}