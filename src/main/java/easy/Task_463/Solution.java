package easy.Task_463;



// Island Perimeter
// https://leetcode.com/problems/island-perimeter/
public class Solution {
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
