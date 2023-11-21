# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should iterate over the input matrix and write down values in the certain place in the result matrix.
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input matrix using inner loop. And every value of matrix[i][j]  we write to the result [j][i]. As a result, we get a transposed matrix.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i]=matrix[i][j];
                }
            }
        return result;
    }
}
```