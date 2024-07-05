package easy.Task_3079;

// Find the Sum of Encrypted Integers
// https://leetcode.com/problems/find-the-sum-of-encrypted-integers/
public class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int result=0;
        for (int num : nums) {
            int max = 0;
            String number = String.valueOf(num);
            for (int j = 0; j < number.length(); j++)
                max = Math.max(max, Character.getNumericValue(number.charAt(j)));

            for (int j = 0; j < number.length(); j++)
                result += max * Math.pow(10, j);
        }
        return result;
    }
}