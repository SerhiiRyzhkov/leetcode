package medium.Task_207;


import java.util.*;

// Course Schedule
// https://leetcode.com/problems/course-schedule/
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        Set<Integer> taken = new HashSet<>();

        for (int[] prerequisite : prerequisites) {
            if (!map.containsKey(prerequisite[0])) map.put(prerequisite[0], new HashSet<>());
            map.get(prerequisite[0]).add(prerequisite[1]);
            if (!map.containsKey(prerequisite[1])) map.put(prerequisite[1], new HashSet<>());
        }

        int delta;
        do {
            delta = taken.size();
            for (Map.Entry<Integer, Set<Integer>> m : map.entrySet()) {
                m.getValue().removeAll(taken);
                if (m.getValue().isEmpty()) taken.add(m.getKey());
            }
        } while (delta != taken.size());

        for(Map.Entry<Integer,Set<Integer>> m: map.entrySet())
            if(!m.getValue().isEmpty())return false;

        return true;
    }
}