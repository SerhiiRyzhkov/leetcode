package medium.Task_802;

import java.util.*;

// Find Eventual Safe States
// https://leetcode.com/problems/find-eventual-safe-states/
public class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Set<Integer> terminal = new HashSet<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i< graph.length;i++) {
            if (graph[i].length == 0) terminal.add(i);
            map.put(i, new ArrayList<>());
            for(int j=0;j<graph[i].length;j++)
                map.get(i).add(graph[i][j]);
        }


        while (true) {
            int s = terminal.size();
            for (Map.Entry<Integer, List<Integer>> m : map.entrySet()) {
                if(terminal.contains(m.getKey()))continue;
                Set<Integer> temp = new HashSet<>(m.getValue());
                temp.removeAll(terminal);
                if (temp.size() == 0) {
                    terminal.add(m.getKey());
                }
            }
            if(terminal.size()==s)break;
        }
        return terminal.stream().sorted().toList();
    }
}