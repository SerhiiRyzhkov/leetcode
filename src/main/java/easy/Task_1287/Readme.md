# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will iterate over the input array and increment counter var util the var gets more than 25%
# Approach
<!-- Describe your approach to solving the problem. -->
25% of an array = array.length/4. So, we iterate over the array and searching an element using var count. As soon the count var gets more than 25% we return the element.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=1;
        int current=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]==current)count++;
            else {
                current=arr[i];
                count=1;
            }
            if(count>arr.length/4)return current;
        }
        return current;
    }
}
```