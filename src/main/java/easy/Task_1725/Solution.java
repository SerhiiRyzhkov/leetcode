package easy.Task_1725;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Number Of Rectangles That Can Form The Largest Square
//https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
      int max=Math.min(rectangles[0][0],rectangles[0][1]);
        List<Integer> list = new ArrayList<>();
        list.add(max);
        if(rectangles.length==1)return 1;

      for(int i=1;i<rectangles.length;i++){

          int square  = Math.min(rectangles[i][0],rectangles[i][1]);
          list.add(square);
          if(square >max)max=square ;

      }


        final int squareMax = max;


        return  (int)(list.stream().filter(el->el==squareMax).count());
    }
}
