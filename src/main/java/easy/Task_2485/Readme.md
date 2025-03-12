# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are two options to resolve the problem: 
1)The checking each element in the array.
2)Start from the middle of the array end decide about moving to the right or to the left after checking each element.

First option is not fast, however code is much easier and briefly. The second one is much faster, but code is getting longer.
# Approach
<!-- Describe your approach to solving the problem. -->
We choose the first option. We use two vars. Left and right vars are using for calculating sums of left and right elements respectively. Staying on the first element, we know, that we have sum to the left equals 1. But we do not know the sum of all elements to the right. So before iterating we calculate sum of all elements using loop and write down the value to the right var. Now we are aware about sum of elements to the left and to the right. So we just calculate new sums on each step and check if they are equal.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int pivotInteger(int n) {
        int left=0;
        int sum = 0;
        int right;

        for(int i=1;i<=n;i++)
            sum+=i;
        right=sum;

        for(int i=1;i<=n;i++)
        {
            left=left+i;
            right=right-(i-1);
            if(right==left)return i;
        }

        return -1;
    }
}
```