package easy.Task_1668;



//  Maximum Repeating Substring
//  https://leetcode.com/problems/maximum-repeating-substring/
public class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String s = word;
        while (sequence.contains(s)){count++; s+=word;}
        return count;
    }
}

