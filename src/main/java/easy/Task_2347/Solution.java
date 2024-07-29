package easy.Task_2347;


import java.util.*;

// Best Poker Hand
// https://leetcode.com/problems/best-poker-hand/
public class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character>set = new HashSet<>();
        for(char ch:suits)set.add(ch);
        if(set.size()==1)return "Flush";

        Map<Integer, Integer> map = new HashMap<>();
        for(int rank: ranks) map.merge(rank,1,Integer::sum);
        return
                switch (map.values().stream().max(Comparator.naturalOrder()).get()) {
                    case 2 -> "Pair";
                    case 3,4 -> "Three of a Kind";
                    default -> "High Card";
                };
    }
}