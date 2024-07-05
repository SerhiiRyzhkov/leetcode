# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need iterate over the input array and always control time between current point and previous one.
# Approach
<!-- Describe your approach to solving the problem. -->
We use three vars to resolve the problem: max - represents current maximal duration, prev - timestamp of the previous key, index - index of current maximal key.
Then we iterate over the input array and check the duration between current key and previous one. And we renew index and max vars only in cases when new duration is bigger than previous one or the duration is equal but current key is lexicographically bigger than previous one. Prev we renew on each iteration. Finally, we get index of the slowest key and return the key.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
               int max = Integer.MIN_VALUE;
        int prev = 0;
        int index=0;

        for(int i=0;i<releaseTimes.length;i++)
        {
            if((releaseTimes[i]-prev >max)||(releaseTimes[i]-prev==max)&&(keysPressed.charAt(index)<keysPressed.charAt(i)))
            {
                index=i;
                max=releaseTimes[i]-prev;
            }
            prev=releaseTimes[i];
        }

        return keysPressed.charAt(index); 
    }
}
```