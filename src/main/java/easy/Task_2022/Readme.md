# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should compare n and m integers to the size of the input array.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we have to make sure, that the size of the input array will be the same with the output array, otherwise we return an empty array. If the sizes are the same we just iterate over the output array and fill it with elements from the input array. Finally, we just return the output array.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length)return new int[][] {};

        int [][] array = new int[m][n];
        int index = 0;

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++) 
                array[i][j] = original[index++];
        
        return array;
    }
}
```