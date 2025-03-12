package easy.Task_2446;

import java.util.Arrays;
import java.util.Date;

// Determine if Two Events Have Conflict
// https://leetcode.com/problems/determine-if-two-events-have-conflict/
public class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        boolean ev1 = false;
        boolean ev2 = false;

        for (int i=0;i<2400;i++)
        {
            if(getTimeNum(event1[0])==i)ev1=true;
            if(getTimeNum(event2[0])==i)ev2=true;
            if(ev1&&ev2)return true;
            if(getTimeNum(event2[1])==i)ev2=false;
            if(getTimeNum(event1[1])==i)ev1=false;

        }
        return false;
    }

    private int getTimeNum(String s){
        int num=0;
        num+=Character.getNumericValue(s.charAt(0))*1000;
        num+=Character.getNumericValue(s.charAt(1))*100;
        num+=Character.getNumericValue(s.charAt(3))*10;
        num+=Character.getNumericValue(s.charAt(4));
        return num;
    }
}