# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Average way to resolve graph problem is using hashmap solution with nodes and their neighbours.
# Approach
<!-- Describe your approach to solving the problem. -->
We create Set and Map containers. Set contains all terminal nodes, map contains all the nodes and lists of their neighbours. Fill both the containers. Then we iterate over map container and check every node: if all of it`s neighbours are terminal. If that is true we add the node to Set container with terminal nodes, otherwise we keep iterating. After end of loop we check if the size of Set has changed. If it has, it means we have found a new terminal node. So, we need to repeat iterating and check all the nodes with new extended hashset. We do it again and again util we notice than the size of our Set container stops to change. It means we have found all terminal nodes, and it is time to return the result. Result has to be sorted before return, So we use Stream API to do it. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
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
```