package easy.Task_507;


// Perfect Number
// https://leetcode.com/problems/perfect-number/
public class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num%2!=0)return false;
        int a = num;
        int sum = 0;

        while ((sum<=num)&&(a>1)){
            a--;
            if(num%a==0)sum+=a;
        }

        return sum==num;
    }
}