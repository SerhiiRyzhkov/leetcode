package easy.Task_326;

//Power of Three
//https://leetcode.com/problems/power-of-three/
public class Solution {
    public boolean isPowerOfThree(int n) {
        double a=n;
        while (a>=1){
            if(a==1)return true;
            a/=3;
        }
        return false;
    }
}