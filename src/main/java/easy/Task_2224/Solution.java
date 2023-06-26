package easy.Task_2224;


// Minimum Number of Operations to Convert Time
// https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/
public class Solution {
    public int convertTime(String current, String correct) {
        int result=0;

        int cur = Integer.parseInt(current.substring(0,2))*60+Integer.parseInt(current.substring(3,5));

        int cor = Integer.parseInt(correct.substring(0,2))*60+Integer.parseInt(correct.substring(3,5));

        int [] time = {60,15,5,1};

        for(int i=0;i<time.length;i++){
            while (cor-cur>=time[i])
            {
                result++;
                cur+=time[i];
            }
        }
        return result;
    }
}