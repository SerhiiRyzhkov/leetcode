package easy.Task_2022;

import java.util.Arrays;

// Convert 1D Array Into 2D Array
// https://leetcode.com/problems/convert-1d-array-into-2d-array/description/
public class Solution {
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