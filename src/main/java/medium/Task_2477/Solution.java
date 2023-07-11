package medium.Task_2477;

import java.util.*;

// Minimum Fuel Cost to Report to the Capital
// https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/
public class Solution {
    public long minimumFuelCost(int[][] roads, int seats) {
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(roads, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(Math.min(o1[0],o1[1]),Math.min(o2[0],o2[1]));
            }
        });

        for(int i=0;i<roads.length;i++){
            System.out.println(roads[i][0]+":"+roads[i][1]);
        }


        for(int i=0;i<roads.length;i++){
            if(Math.min(roads[i][0],roads[i][1])==0)map.put(Math.max(roads[i][0],roads[i][1]),1);
            else map.put(Math.max(roads[i][0],roads[i][1]),map.get(Math.min(roads[i][0],roads[i][1]))+1);
        }


        System.out.println();
        System.out.println();
        for(Map.Entry<Integer,Integer> m: map.entrySet())
            System.out.println(m.getKey()+":"+m.getValue());


        return -1;
    }
}