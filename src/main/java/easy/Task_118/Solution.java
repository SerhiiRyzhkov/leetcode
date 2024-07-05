package easy.Task_118;

import java.util.ArrayList;
import java.util.List;

// Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/description/
public class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>(List.of(1)));
        for(int i=1;i<numRows;i++) {
            result.add(new ArrayList<>());
            result.get(i).add(1);
            for(int j=1;j<i;j++)
                result.get(i).add(0);
            result.get(i).add(1);
        }


        for(int i=2;i<numRows;i++)
            for(int j=1;j<result.get(i).size()-1;j++)
                result.get(i).set(j,result.get(i-1).get(j-1)+result.get(i-1).get(j));


        return result;
    }
}