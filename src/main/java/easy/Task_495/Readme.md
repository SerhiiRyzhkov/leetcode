# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Two possible ways to resolve - check every second from 0 second to the last second from the input array or check gaps between every poisoning. The second way is easier, shortly, and faster. Because we don`t need to check seconds when nothing happens.
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input array and check gaps between values. And just increment result var. We have to add whether duration or gap. Regarding the fact, that every poisoning - reset timer, we have to add the minimal value from them. Then, all we need is return the result value. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result=0;

        for(int i=1;i<timeSeries.length;i++)
            result+=Math.min(timeSeries[i]-timeSeries[i-1],duration);

        return result+duration;
    }
}
```