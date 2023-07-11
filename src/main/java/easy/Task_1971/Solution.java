package easy.Task_1971;


import java.util.*;

// Find if Path Exists in Graph
// https://leetcode.com/problems/find-if-path-exists-in-graph/
public class Solution {
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