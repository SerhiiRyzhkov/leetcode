package easy.Task_1886;

import java.util.*;

//Determine Whether Matrix Can Be Obtained By Rotation
//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class Solution {
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



