package easy.Task_509;


// Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/description/
public class Solution {
    public int fib(int n) {
        int [] array = new int[n+1];
        array[0]=0;
        if(array.length>1)array[1]=1;
        for(int i=2;i<array.length;i++)
            array[i]=array[i-1]+array[i-2];
        return array[n];
    }
}