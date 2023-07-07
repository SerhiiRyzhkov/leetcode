package medium.Task_2192;

import java.util.*;

// All Ancestors of a Node in a Directed Acyclic Graph
// https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/

public class Solution {
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