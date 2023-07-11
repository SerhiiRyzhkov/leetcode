# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need to transform binary tree to a graph, because we will need to walk in both directions.
# Approach
<!-- Describe your approach to solving the problem. -->
First of all, we, using queue container, walk over the tree and create graph (write to map container all the neighbors of every node). Then we create new hashmap container levels. Where key - it`s level, and value - of all elements of that value. Then we begin to fill this hashmap level by level. Level 0 is known because level 0 is the element from input data. Level 1 also we know perfectly, because it is all the neighbours of element, and we keep them in map container. Then we fill other levels. To keep a level we need add there all the neighbours of elements from previous level. Besides, we have to keep only distinct elements in list of level elements, so we use stream API. Using stream API, we also delete the element from input data. Then we have to delete all the elements from previous level, because elements can not be at the several levels at the same time. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<Integer, List<Integer>> map = new HashMap<>();


        Queue<TreeNode>queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty())
        {
            TreeNode node = queue.remove();

            if(!map.containsKey(node.val))map.put(node.val,new ArrayList<>());

            if(node.left!=null){
                queue.add(node.left);
                map.get(node.val).add(node.left.val);
                    if(!map.containsKey(node.left.val))map.put(node.left.val, new ArrayList<>());
                    map.get(node.left.val).add(node.val);
            }


            if(node.right!=null){
                queue.add(node.right);
                map.get(node.val).add(node.right.val);
                    if(!map.containsKey(node.right.val))map.put(node.right.val, new ArrayList<>());
                    map.get(node.right.val).add(node.val);
            }
        }

        Map<Integer, List<Integer>> levels = new HashMap<>();

        List<Integer> previousLevels = new ArrayList<>();

        int level=0;
        levels.put(level,new ArrayList<>(List.of(target.val)));

        while (level<k){
            levels.put(level+1, new ArrayList<>());

            for(int i=0;i<levels.get(level).size();i++)
                levels.get(level+1).
                        addAll(map.get(levels.get(level).get(i)));

            previousLevels.addAll(levels.get(level));

            level++;
            levels.get(level).removeAll(levels.get(level-1));

            levels.put(level,
            levels.get(level).stream().distinct().filter(el->el!=target.val).toList());
        }


        List<Integer>result = new ArrayList<>(levels.get(k));

        result.removeAll(previousLevels);

        return result;
    }
}
```