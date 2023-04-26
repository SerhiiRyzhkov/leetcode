# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Without hesitation, I will need hashSet to keep input information and hadle that in more comfortable way
# Approach
<!-- Describe your approach to solving the problem. -->
I create 3 hashSets to keep input information: Task-Time, Task-Employee, Employee-MaxTime. Then I fill those hashSets. The first task is handled separately because 0th task starts at time 0. Then it`s easy to find maxTime Task and find out what workers did the longest task. Then I return minimal employee id from the list of workers who did the longest task. It is not the fastest way to solve problem. But easy to understand.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        //task - time
        Map<Integer,Integer> timeMap = new HashMap<>();
        //task - employee
        Map<Integer,Integer> empMap = new HashMap<>();
        //emp - time
        Map<Integer,Integer> hardestTask = new HashMap<>();


        timeMap.put(0,logs[0][1]);
        empMap.put(0,logs[0][0]);
        hardestTask.put(logs[0][0],logs[0][1]);

        for(int i=1;i<logs.length;i++){
            int time = logs[i][1]-logs[i-1][1];
            int employee = logs[i][0];
            int task = i;
            timeMap.put(task,time);
            empMap.put(task,logs[i][0]);

            if(!hardestTask.containsKey(employee))
                hardestTask.put(employee,time);
            else {
                hardestTask.put(employee,Math.max(time,hardestTask.get(employee)));
            }

        }

        
        int maxTime = Collections.max(timeMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();
        List<Integer>bestWorkers= new ArrayList<>();
        for(Integer el: hardestTask.keySet())
            if(hardestTask.get(el)==maxTime)bestWorkers.add(el);

        return bestWorkers.stream().mapToInt(v->v).min().getAsInt();


    }
}

```