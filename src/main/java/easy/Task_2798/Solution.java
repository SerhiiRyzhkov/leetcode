package easy.Task_2798;

import java.util.Arrays;

// Number of Employees Who Met the Target
// https://leetcode.com/problems/number-of-employees-who-met-the-target/
public class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return (int) Arrays.stream(hours).filter(el->el>=target).count();
    }
}