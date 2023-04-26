# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Two possible way to resolve problem keep odd and even numbers in two different containers or write down numbers immediately in result array iterating over the input array.
# Approach
<!-- Describe your approach to solving the problem. -->
We create two containers (for odd and even numbers) and fill them with numbers. Then we rewrite input array using those containers and return array.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd = new ArrayList<>();  //NECHET
        List<Integer> even = new ArrayList<>(); //CHET
        for (int num : nums)
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        for(int i=0;i<nums.length;i++)
            if(i%2==0)nums[i]=even.remove(0);
        else nums[i]=odd.remove(0);


        return nums;
    }
}

```