package easy.Task_1304;


//  Find N Unique Integers Sum up to Zero
//  https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class Solution {
    public int[] sumZero(int n) {

        int [] array = new int[n];

        int a=2;
        int start = n%2==0?0:1;

        for(int i=start;i<n;i=i+2) {
            a++;
            array[i] = a;
            array[i+1]=a*-1;
        }
        return array;
    }
}