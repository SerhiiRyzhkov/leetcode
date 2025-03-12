package easy.Task_2469;

// Convert the Temperature
// https://leetcode.com/problems/convert-the-temperature/
public class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius+273.15,celsius*1.80+32.00};
    }
}