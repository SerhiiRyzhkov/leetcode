# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s totally clear, that if we need to find solution with log n complexity, we have to use binary search.

# Approach
<!-- Describe your approach to solving the problem. -->
We use classical binary search without recursion. We do search util we find the target or util our first gets bigger than last. If our first gets bigger than last, it means, that we don`t have the target in the array. And we have to insert it to the index where last marker or first marker after binary search. We have to select the maximal value between them and insert target there.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
Log(n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int searchInsert(int[] nums, int target) {

        int first =0;
        int last = nums.length-1;
        int middle = (first+last)/2;


        while (first<=last){
            if(nums[middle]==target) return middle;
            else if (nums[middle]<target){
                first=middle+1;
                middle=(first+last)/2;
            }
            else {
                last=middle-1;
                middle=(first+last)/2;
            }

        }

        return Math.max(first,last);

    }

}
```