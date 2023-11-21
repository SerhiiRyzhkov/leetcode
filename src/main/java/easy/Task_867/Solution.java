package easy.Task_867;

import java.util.ArrayList;
import java.util.List;

// Transpose Matrix
// https://leetcode.com/problems/transpose-matrix/
public class Solution {
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

