package medium.Task_179;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Largest Number
//https://leetcode.com/problems/largest-number/
public class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) list.add(String.valueOf(num));

        Comparator<String> comparator = (o1, o2) -> {
            BigInteger bigInteger1 = new BigInteger(o1+o2+"");
            BigInteger bigInteger2 = new BigInteger(o2+o1+"");
            return  bigInteger2.compareTo(bigInteger1);
        };

        list.sort(comparator);

        StringBuilder sb = new StringBuilder();

        list.forEach(sb::append);



        while ((sb.charAt(0)=='0')&&(sb.length()>1))
        {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}