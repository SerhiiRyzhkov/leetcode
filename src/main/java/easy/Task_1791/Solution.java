package easy.Task_1791;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Find Center of Star Graph
// https://leetcode.com/problems/find-center-of-star-graph/description/
public class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int[] edge : edges) {
            map.merge(edge[0], 1, Integer::sum);
            map.merge(edge[1], 1, Integer::sum);
        }
        return
                map.entrySet().stream().filter(el->el.getValue()==edges.length).findFirst().get().getKey();
    }
}