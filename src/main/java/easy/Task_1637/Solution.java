package easy.Task_1637;


import java.util.*;
import java.util.stream.Collectors;

//  Widest Vertical Area Between Two Points Containing No Points
//  https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for(int[] a: points)list.add(a[0]);
        Collections.sort(list);

        for(int i=0;i<list.size()-1;i++)result=Math.max(result,list.get(i+1)-list.get(i));
        return result;
    }
}