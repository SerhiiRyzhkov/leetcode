package easy.Task_1491;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Average Salary Excluding the Minimum and Maximum Salary
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class Solution {
    public double average(int[] salary) {
        return Arrays.stream(salary).filter(el->((el!=Arrays.stream(salary).min().getAsInt())&&
                (el!=Arrays.stream(salary).max().getAsInt()))).average().getAsDouble();
    }
}