package easy.Task_58;

//Length of Last Word
//https://leetcode.com/problems/length-of-last-word/
public class Solution {
    public int lengthOfLastWord(String s) {
        String [] array = s.split(" ");

        return array[array.length-1].length();
    }
}