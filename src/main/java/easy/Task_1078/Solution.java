package easy.Task_1078;

import java.util.ArrayList;
import java.util.List;

//  Occurrences After Bigram
//  https://leetcode.com/problems/occurrences-after-bigram/
public class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        String [] array = text.split(" ");
        List<String> list = new ArrayList<>();


        for(int i=1;i<array.length-1;i++)
            if((array[i].equals(second))&&(array[i-1].equals(first))) list.add(array[i+1]);

        return list.toArray(new String[0]);
    }
}