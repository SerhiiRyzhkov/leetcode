package easy.Task_401;

import java.util.ArrayList;
import java.util.List;

// Binary Watch
// https://leetcode.com/problems/binary-watch/
public class Solution {
    public List readBinaryWatch(int num) {
        List<String>result = new ArrayList<>();
        for(int i=0;i<12;i++)
        {
            for(int j=0;j<60;j++)
            {
                if(Integer.bitCount(i&239)+Integer.bitCount(j)==num)
                    result.add(timeFormat(i,j));
            }
        }

        return result;
    }
    private String timeFormat(int hours, int minutes){
        StringBuilder sb = new StringBuilder();
        sb.append(hours).append(":");
        if(minutes<10)sb.append(0);
        sb.append(minutes);
        return sb.toString();
    }
}