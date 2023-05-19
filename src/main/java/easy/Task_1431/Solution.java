package easy.Task_1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  Kids With the Greatest Number of Candies
//  https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean>result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}