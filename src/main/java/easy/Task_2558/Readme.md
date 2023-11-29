# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s a task for practice PriorityQueue
# Approach
<!-- Describe your approach to solving the problem. -->
We create priority queue, where the first element will be always maximum element from the queue and add there all the elements from the input array. Then we just k times the maximal  change by its sqrt. And we return the sum of all elements from the queue.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nlogN)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public long pickGifts(int[] gifts, int k) {
      long result=0;
        Queue<Integer>queue = new PriorityQueue<>((o1, o2) -> o2-o1);

        Arrays.stream(gifts).forEach(queue::add);

        for(int i=0;i<k;i++)
        {
            int a=queue.remove();
            queue.add((int) Math.sqrt(a));
        }
        
       for(Integer i:queue)
            result+=i;
        
        return result;

        
    }
}
```