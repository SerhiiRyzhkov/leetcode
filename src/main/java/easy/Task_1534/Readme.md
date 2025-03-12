# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The easiest way to resolve problem is using inner loops O^3. It is not fast, but we should choose between fast code and brief code. I prefer compact code that easy to understand. 
# Approach
<!-- Describe your approach to solving the problem. -->
We use 3 loops. Each loop mean the one of elements of  triplet. In that way we are able to receive all possible combinations from the input array. Also, we use result var that we increment each time when we found a suitable triplet.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n^3)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(Math.abs(arr[i]-arr[j])<=a){
                    for(int k=j+1;k<arr.length;k++){
                        if(Math.abs(arr[j]-arr[k])<=b&&Math.abs(arr[i]-arr[k])<=c)
                            result++;
                    }
                }
            }
        }

        return result;
    }
}
```