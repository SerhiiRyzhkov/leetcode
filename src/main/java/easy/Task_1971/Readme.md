# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Classical problem with graphs. Dfs will solve it.
# Approach
<!-- Describe your approach to solving the problem. -->
First of all we consider special case when destination equals to source. We have to return true. Then we create Map container that contains every node and it`s neighbours and fill it using for loop. Then we use dfs to walk over the graph. We start from source node and walk over all of his neighbours and their neighbours. Boolean array visited helps us not to walk over the same node few times. If among the neighbours we found the destination node, we have to stop dfs and return true! 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
o(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    private boolean found;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)return true;    
        Map<Integer,List<Integer>>map =new HashMap<>();
        boolean [] visited = new boolean[n];

        for(int i=0;i<n;i++)map.put(i,new ArrayList<>());

        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        dfs(map,visited,source,destination);


        return found;
    }

    private void dfs(Map<Integer,List<Integer>> map, boolean[] visited, int source, int destination){

        if(visited[source]||found)return;
        visited[source]=true;

        for(int i=0;i<map.get(source).size();i++){
            int neighbour = map.get(source).get(i);
            if(neighbour==destination){
                found=true;
                break;
            }
            if(!visited[neighbour])
            dfs(map,visited,neighbour,destination);
        }
    }
}
```