package easy.Task_766;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Toeplitz Matrix
//https://leetcode.com/problems/toeplitz-matrix/
public class Solution {
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