# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The easiest way will be using List container where I will collect numbers from input array.
# Approach
<!-- Describe your approach to solving the problem. -->
Create List<Integer>. Write down there numbers from input array. If element=0, we write it twice. Then we write numbers from list back to input array.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public void duplicateZeros(int[] arr) {
           List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            list.add(arr[i]);
        if(arr[i]==0)list.add(0);
        }
        for(int i=0;i<arr.length;i++)
            arr[i]=list.get(i);
    }
}
```