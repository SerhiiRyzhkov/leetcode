package easy.Task_1662;

import java.util.*;

//  Check If Two String Arrays are Equivalent
//  https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();


        Arrays.stream(word1).forEach(sb1::append);
        Arrays.stream(word2).forEach(sb2::append);


        return sb1.toString().equals(sb2.toString());
    }
}
