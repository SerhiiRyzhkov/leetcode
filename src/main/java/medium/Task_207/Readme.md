# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Classical graph walking task.
# Approach
<!-- Describe your approach to solving the problem. -->
We use 2 containers to resolve a problem: Set - here we keep courses, that have been taken; Map - here we keep courses and lists of courses what are required to get the course from Key. Then we fill Map container. Then, using while loop we iterate over map. We transfer courses that we are able to get from map to set. While loop is working util we are able to get new courses. Then we return true if all the lists are empty in map, otherwise we return false.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
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
```