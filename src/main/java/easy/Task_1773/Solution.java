package easy.Task_1773;

import java.util.List;

// Count Items Matching a Rule
// https://leetcode.com/problems/count-items-matching-a-rule/description/
public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int key = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };

        for(List<String> item:items)
            if(item.get(key).equals(ruleValue))count++;

        return count;
    }
}