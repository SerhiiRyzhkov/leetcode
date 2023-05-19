# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are two possible ways to solve the problem: 1) iterate over the array and delete pairs, previously transform it to a list. 2) Use HashSet or HashMap container to keep elements during the iteration

# Approach
<!-- Describe your approach to solving the problem. -->
We create result array with length 2. We create set which will help us to store values from the array during the iteration.
Iterating over the array we are searching for pairs using the set. When we found a pair we increment the first number of result and decrement the second one.
If current number does not have a pair in set container we just increment the second number of the input array. After that we get a result array, and we need to return it.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int [] result = new int[2];
        Set<Integer>set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                result[0]++;
                set.remove(nums[i]);
                result[1]--;
            }
            else
            {
            set.add(nums[i]);
            result[1]++;
            }
        }


        return result;

    }
}
```