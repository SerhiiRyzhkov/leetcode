package easy.Task_2094;

import java.util.*;
import java.util.stream.Collectors;

// Finding 3-Digit Even Numbers
// https://leetcode.com/problems/finding-3-digit-even-numbers/
public class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer>list = Arrays.stream(digits).boxed().toList();

        List<Integer>result = new ArrayList<>();
        for(int i=100;i<1000;i++){
            List<Integer> temp = new ArrayList<>(list);
            int a = Character.getNumericValue(String.valueOf(i).charAt(0));
            int b = Character.getNumericValue(String.valueOf(i).charAt(1));
            int c = Character.getNumericValue(String.valueOf(i).charAt(2));
            if(a!=0&&c%2==0&&temp.remove((Integer)a)&&temp.remove((Integer)b)&&temp.remove((Integer)c))result.add(i);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}