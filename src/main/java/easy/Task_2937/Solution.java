package easy.Task_2937;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Make Three Strings Equal
// https://leetcode.com/problems/make-three-strings-equal/
public class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int i = 0;

        while (i<s1.length()&&
                i<s2.length()&&
                i<s3.length()&&
                s1.charAt(i)==s2.charAt(i)&&s2.charAt(i)==s3.charAt(i)) {
            i++;
        }


        if(i==0||s1.length()<i||s2.length()<i||s3.length()<i)return -1;

        else return s1.length()-i+s2.length()-i+s3.length()-i;
    }
}