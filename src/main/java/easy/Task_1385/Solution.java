package easy.Task_1385;

//Find the Distance Value Between Two Arrays
//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count =0;

        for(int i=0;i<arr1.length;i++)
        {
            boolean flag = true;
            for(int j=0;j<arr2.length;j++){
                int distance = Math.abs(arr1[i]-arr2[j]);
                if(distance<=d) {flag=false; break;}
            }
            if(flag)count++;
        }

        return count;
    }
}
