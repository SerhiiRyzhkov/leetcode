package easy.Task_2138;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


// Find Subsequence of Length K With the Largest Sum
//https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/
public class Solution {
    public String[] divideString(String s, int k, char fill) {


        int size = 0;

        while (size<s.length()||size%3!=0)size++;

        StringBuilder [] array = new StringBuilder[size/k];
        int index=0;

        for(int i =0; i<s.length();i++)
        {
            if(array[index]==null) array[index]=new StringBuilder().append(s.charAt(i));
            else if(array[index].length()==k){index++;array[index]=new StringBuilder().append(s.charAt(i));}
            else array[index].append(s.charAt(i));
        }


        System.out.println(Arrays.toString(array));

        return null;
    }

}