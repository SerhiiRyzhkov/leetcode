package easy.Task_2042;

import java.util.ArrayList;
import java.util.List;

//Check if Numbers Are Ascending in a Sentence
//https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
public class Solution {
    public boolean areNumbersAscending(String s) {
        int a=0;
        String [] array = s.split(" ");
        for(int i=0;i<array.length;i++)
        {
            try {
                if(Integer.valueOf(array[i])<=a)return false;
                else a=Integer.valueOf(array[i]);
            }
            catch (NumberFormatException e) {continue;}
        }

        return true;
    }
}
