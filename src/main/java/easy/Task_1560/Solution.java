package easy.Task_1560;


import java.util.*;


// Most Visited Sector in a Circular Track
// https://leetcode.com/problems/most-visited-sector-in-a-circular-track/
public class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int [] sectors = new int[n+1];
        int current = rounds[0];
        int max=0;

        for(int i=0;i<rounds.length;i++){

            if(i==rounds.length-1){
                sectors[current]++;
                if(sectors[current]>max)max=sectors[current];
                break;
            }
            while (current!=rounds[i+1]){
                sectors[current]++;
                if(sectors[current]>max)max=sectors[current];
                if(++current>n)current=1;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i =1;i<sectors.length;i++)
            if(sectors[i]==max)result.add(i);

        return result;
    }
}