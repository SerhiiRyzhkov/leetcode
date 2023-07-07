package easy.Task_412;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Fizz Buzz
// https://leetcode.com/problems/fizz-buzz/
public class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();

        for(int i=1;i<=n;i++)
        {
            if((i%3==0)&&(i%5==0))result.add("FizzBuzz");
            else if (i%3==0) result.add("Fizz");
            else if (i%5==0) result.add("Buzz");
            else result.add(String.valueOf(i));
        }

        return result;
    }
}