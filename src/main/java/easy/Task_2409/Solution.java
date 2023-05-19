package easy.Task_2409;

import java.util.*;

//  Count Days Spent Together
//  https://leetcode.com/problems/count-days-spent-together/
public class Solution {
    private int [] year  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        Set<Integer> aliceDays = new HashSet<>();
        Set<Integer> bobDays = new HashSet<>();

        for(int i=getDays(arriveAlice);i<=getDays(leaveAlice);i++)
            aliceDays.add(i);
        for(int i=getDays(arriveBob);i<=getDays(leaveBob);i++)
            bobDays.add(i);

        aliceDays.retainAll(bobDays);

        return aliceDays.size();

    }

    private int getDays(String date){
        int result=0;
        int index=0;
        while (Integer.valueOf(date.split("-")[0])-1!=index)
        {
            result+=year[index++];
        }
        result+=Integer.valueOf(date.split("-")[1]);

        return result;

    }
}