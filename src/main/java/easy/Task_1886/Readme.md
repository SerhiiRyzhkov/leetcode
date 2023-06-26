# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The obvious way to resolve the problem is rotating matrix in 90-degree 4 times.
# Approach
<!-- Describe your approach to solving the problem. -->
We create an additional method rotate() that rotates a matrix in 90-degree. We rotate a matrix 4 times and check if the rotated matrix is equals to a target. If after 4 times of rotating we have not found matching we have to return false.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++) {
            mat = rotate(mat);
            if(Arrays.deepEquals(mat, target))return true;
        }
        return false;
    }

    private int[][] rotate(int[][] a){
        int [][] result = new int[a.length][a[0].length];
        int k=0;
        int n=0;

        for(int i=a.length-1;i>=0;i--){
            for(int j=0;j<a[i].length;j++) {
                result[k++][n] = a[i][j];
            }
            k=0;
            n++;
        }
        return result;
    }
}
```