package medium.Task_1882;

import java.util.*;

// Process Tasks Using Servers
// https://leetcode.com/problems/process-tasks-using-servers/description/
public class Solution {

    public int[] assignTasks(int[] servers, int[] tasks) {
        int[] result = new int[tasks.length];
        int index = 0;
        List<Integer> serversQueue = new LinkedList<>();
        Queue<Integer> tasksQueue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < servers.length; i++) {
            map.put(i, 0);
            serversQueue.add(i);
        }
        for (int task : tasks) tasksQueue.add(task);


        /*Comparator<Integer> comparator = (o1, o2) -> {
            if ((map.get(o1) == 0) && (map.get(o2) == 0)) {
                return Integer.compare(servers[o2], servers[o1]);
            } else if ((map.get(o1) == 0) && (map.get(o2) != 0)) return -1;
            else if ((map.get(o1) != 0) && (map.get(o2)) == 0) return 1;
            else return 0;
        };*/
        Comparator<Integer> comparator = (o1, o2) -> {
            if ((map.get(o1) == 0) && (map.get(o2) == 0)) {
                return Integer.compare(servers[o2], servers[o1]);
            } else if ((map.get(o1) == 0) && (map.get(o2) != 0)) return -1;
            else if ((map.get(o1) != 0) && (map.get(o2)) == 0) return 1;
            else return 0;
        };


        while (index < tasks.length) {
            for (Map.Entry<Integer, Integer> m : map.entrySet())
                if (m.getValue() > 0) m.setValue(m.getValue() - 1);
            serversQueue.sort(comparator);
            int current_serv = -1;
            if (map.get(serversQueue.get(0)) == 0) current_serv = serversQueue.get(0);

            if (current_serv != -1) {
                map.put(current_serv, tasksQueue.remove());
                result[index++] = current_serv;
            }
        }

        return result;
    }
}