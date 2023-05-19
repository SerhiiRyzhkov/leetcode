# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I might walk over the matrix in traditional way or over the every diagonal.

# Approach
<!-- Describe your approach to solving the problem. -->
The main idea is: I created List<Set<Integer>>. Every set in the list is the diagonal of matrix. Walking over the matrix in traditional way, I define which number of diagonal diagN. Then I put it to the appropriate set. Every set has size = 1. If any set size increase 1, it means we have at least two different numbers in the diagonal. So we return false. If we did not find Set with size>1, it means that all diagonals of the input matrix has the same numbers, and we return true;   
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {

        List<Set<Integer>> list = new ArrayList<>();
        int size = matrix[0].length+matrix.length-1;
        
        for(int i=0;i<size;i++)
            list.add(new HashSet<>());

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++) {
            int diagN = j-i+matrix.length-1;
            list.get(diagN).add(matrix[i][j]);
            if(list.get(diagN).size()>1)return false;
            }
        }

        return true;
    }
}
```