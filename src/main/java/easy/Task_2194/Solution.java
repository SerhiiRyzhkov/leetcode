package easy.Task_2194;


import java.util.ArrayList;
import java.util.List;


// Cells in a Range on an Excel Sheet
// https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
public class Solution {
    public List<String> cellsInRange(String s) {
        char ch1 = s.charAt(0);
        char ch2 = s.charAt(3);
        int n1= s.charAt(1)-48;
        int n2= s.charAt(4)-48;

        List<String> result = new ArrayList<>();

        char ch = ch1;

        while (ch<=ch2) {
            for(int i=n1;i<=n2;i++)
                result.add(ch+""+i);
            ch++;
        }

        return result;
    }
}