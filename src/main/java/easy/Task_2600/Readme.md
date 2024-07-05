# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We can create an array and fill it with 1,0 and -1 and count a sum of k elements. Or we just can use an imaginary array. 
# Approach
<!-- Describe your approach to solving the problem. -->
We create imaginary array and going to iterate over it with var index. Our imaginary array has view (1,1,1,1,0,0,0,0,-1,-1). We start from index 0 and increment sum until we still has '1' in the array or k times. Then we have 0 in the array. So we do not increment or decrement sum we just move index to the start of '-1' elements. We do it while we still have elements or our current index less than k.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        int index=0;

        for(int i=index;i<numOnes&&i<k;i++)
            sum++;

        index=numOnes+numZeros;

        for(int i=index;i<numZeros+numOnes+numNegOnes&&i<k;i++)
            sum--;

        return sum;
    }
}
```