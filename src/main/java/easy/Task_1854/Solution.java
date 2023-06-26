package easy.Task_1854;

import java.util.Map;
import java.util.TreeMap;

// Maximum Population Year
// https://leetcode.com/problems/maximum-population-year/
public class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> map = new TreeMap<>();
        int max=0;
        int current=0;
        int year=0;

        for (int[] log : logs) {
            for (int j = 0; j < log.length; j++) {
                if (!map.containsKey(log[j])) map.put(log[j], 0);
                if (j == 0) map.put(log[j], map.get(log[j]) + 1);
                else map.put(log[j], map.get(log[j]) - 1);
            }
        }


        for(Map.Entry<Integer,Integer> m: map.entrySet()) {
            current += m.getValue();
            if(current > max) {
                max = current;
                year=m.getKey();
            }
        }

        return year;
    }
}