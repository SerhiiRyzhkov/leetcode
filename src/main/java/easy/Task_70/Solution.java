package easy.Task_70;

// Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/
public class Solution {
    public int climbStairs(int n) {

        int [] array = new int[n+2];

        array[1]=1;
        array[2]=2;


        for(int i=3;i<array.length;i++)
            array[i]=array[i-1]+array[i-2];

        return array[n];
    }
}