package easy.Task_2432;

import java.util.*;

//The Employee That Worked on the Longest Task
//https://leetcode.com/problems/the-employee-that-worked-on-the-longest-task/
public class Solution {
    public int hardestWorker(int n, int[][] logs) {
        //task - time
        Map<Integer, Integer> timeMap = new HashMap<>();
        //task - employee
        Map<Integer, Integer> empMap = new HashMap<>();
        //emp - time
        Map<Integer, Integer> hardestTask = new HashMap<>();


        timeMap.put(0, logs[0][1]);
        empMap.put(0, logs[0][0]);
        hardestTask.put(logs[0][0], logs[0][1]);

        for (int i = 1; i < logs.length; i++) {
            int time = logs[i][1] - logs[i - 1][1];
            int employee = logs[i][0];
            int task = i;
            timeMap.put(task, time);
            empMap.put(task, logs[i][0]);

            if (!hardestTask.containsKey(employee))
                hardestTask.put(employee, time);
            else {
                hardestTask.put(employee, Math.max(time, hardestTask.get(employee)));
            }

        }


        int maxTime = Collections.max(timeMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();
        List<Integer> bestWorkers = new ArrayList<>();
        for (Integer el : hardestTask.keySet())
            if (hardestTask.get(el) == maxTime) bestWorkers.add(el);

        return bestWorkers.stream().mapToInt(v -> v).min().getAsInt();


    }
}
