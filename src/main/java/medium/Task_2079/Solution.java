package medium.Task_2079;

import java.util.*;

// Watering Plants
// https://leetcode.com/problems/watering-plants/
public class Solution {

    public int wateringPlants(int[] plants, int capacity) {
        int result=0;
        int can=capacity;
        for(int i = 0; i<plants.length;i++ )
            if(plants[i]<=can){
                result++;
                can-=plants[i];
            }
            else {
                result+=i*2+1;
                can=capacity-plants[i];
            }


        return result;
    }
}