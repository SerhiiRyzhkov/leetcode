# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should check each char back and forward distance and compare that.
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input String to check each char. We use two vars: target and current. Math.abs(target-current) using this we are searching the distance to a target moving forward. In a similar way we search for a distance moving back: 26 - Math.abs(target-current). Then, we compare them and add min value to a result var. After that, we just return the result var.  
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int minTimeToType(String word) {
        int result = 0;
        int current = 0; 

        for (int i = 0; i < word.length(); i++) {
          int target = word.charAt(i)- 'a';
          int distance = Math.min(Math.abs(target-current),26 - Math.abs(target-current));
          result+=distance+1;
          current=target;
        }

        return result;
    }
}
```