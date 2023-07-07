# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need iterate over both input arrays at the same time.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we sort array nums and create a result array. Then we, using while loop, iterate over queries array. We use two vars inside while loop: count and a. Inside while loop we use for loop. Inside for loop we iterate over nums array and increment count var util we don`t reach value of the element from queries array. As we reach the element, we write down value of count var to the result array.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nlogn)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int [] result = new int[queries.length];
        Arrays.sort(nums);
        
        int index=0;
        while (index<result.length) {
            int a = 0;
            int count =0;
            for (int num : nums) {
                if (a + num <= queries[index]) {
                    a += num;
                    count++;
                } else break;
            }
            result[index++] = count;
        }
        return result;
    }
}
```