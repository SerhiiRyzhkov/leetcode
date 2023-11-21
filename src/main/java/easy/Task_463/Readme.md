# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need additional method to check grids is they are ground or water   
# Approach
<!-- Describe your approach to solving the problem. -->
We create a method, that checks if a grid watter or ground. Then we iterate over all ground elements of the array and check it`s neighbours if they water or ground, increasing p var.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;

        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1){
                    if(isWater(grid,i-1,j))p++;
                    if(isWater(grid,i,j+1))p++;
                    if(isWater(grid,i+1,j))p++;
                    if(isWater(grid,i,j-1))p++;
                }
            }


        return p;
    }

    private boolean isWater(int [][] grid, int i, int j){
        return i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0;
    }

}
```