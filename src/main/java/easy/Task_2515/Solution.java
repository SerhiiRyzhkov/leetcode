package easy.Task_2515;

import java.util.*;

//Shortest Distance to Target String in a Circular Array
//https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/
public class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {

        int backIndex=startIndex;
        int forwardIndex=startIndex;

        int steps=0;

        while (steps<words.length){
            if((words[backIndex--].equals(target))||(words[forwardIndex++].equals(target))) return steps;
            else {
                steps++;
                if(backIndex==-1)backIndex=words.length-1;
                if(forwardIndex==words.length) forwardIndex=0;
            }
        }


        return -1;
    }
}