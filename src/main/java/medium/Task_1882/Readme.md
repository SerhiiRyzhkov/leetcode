# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The task sounds like we will need to implement priority queue container with list of servers.
# Approach
<!-- Describe your approach to solving the problem. -->
We create two comparators and two priority queues. The first pair for servers that are available, and the second one for servers that are in processing. In the first moment of time all the servers are free, so we put all the servers to the freeServQueue. Then we begin to assign tasks using for loop. 
Consider every iteration:
we calculate time. It depends on if we have available servers. if we don`t have available servers time = time of the first server from the top of busy servers queue. Otherwise, time = max value between i index and current value of time.
Then we, using temp var, we work out a task with current server, write down task to result var and back server to queue with free servers. We are repeating these operations while we have tasks to do.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n^2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {

    public int[] assignTasks(int[] servers, int[] tasks) {
        int[] result = new int[tasks.length];

        Comparator<int[]> freeServComparator = (a, b) -> (a[0] == b[0]) ? (a[1] - b[1]) : (a[0] - b[0]);
        Comparator<int[]> busyServComparator = Comparator.comparingInt(a -> a[0]);

        PriorityQueue<int[]> freeServQueue = new PriorityQueue<>(freeServComparator);
        PriorityQueue<int[]> busyServQueue = new PriorityQueue<>(busyServComparator);

        for (int i = 0; i < servers.length; i++) freeServQueue.add(new int[]{servers[i], i});

        int time = 0;

        for (int i = 0; i < tasks.length; i++) {
            time = Math.max(i, time);
            if (freeServQueue.isEmpty()) time = busyServQueue.peek()[0];


            while (!busyServQueue.isEmpty() && time == busyServQueue.peek()[0]) {
                int[] temp = busyServQueue.poll();
                int[] freeServer = {servers[temp[1]], temp[1]};
                freeServQueue.offer(freeServer);
            }
            int[] server = freeServQueue.poll();
            result[i] = server[1];
            busyServQueue.offer(new int[]{time + tasks[i], server[1]});


        }
        return result;
    }
}
```