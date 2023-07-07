# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are a lot of ways to resolve a problem. We can create matrix of nodes, we can iterate over a list inside another list etc... But we will have to find the fastest way to resolve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we create two lists. Temp list ant result list. We initialize new arrayLists there according to the input amount of nodes. Then we fill temp list with nodes where we have a path from the node equals to the index. Then, we use Queue for every node of the problem. We put there a starting node. And add fill result list during traversal over nodes from queue.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n^2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>>result = new ArrayList<>();
        List<List<Integer>> temp = new ArrayList<>();
        for(int i=0;i<n;i++) {
            temp.add(new ArrayList<>());
            result.add(new ArrayList<>());
        }
        for (int[] edge : edges) temp.get(edge[0]).add(edge[1]);


        for(int i=0;i<n;i++){
            Queue<Integer>queue=new ArrayDeque<>();
            boolean [] visited = new boolean[n];
            queue.add(i);
            visited[i]=true;
            while (!queue.isEmpty()){
                int node = queue.remove();

                if(node!=i)
                    result.get(node).add(i);
                for(int j=0;j<temp.get(node).size();j++){
                    if(!visited[temp.get(node).get(j)]){
                        visited[temp.get(node).get(j)]=true;
                        queue.add(temp.get(node).get(j));
                    }
                }
            }

        }
        result.forEach(Collections::sort);
        return result;
    }
}
```