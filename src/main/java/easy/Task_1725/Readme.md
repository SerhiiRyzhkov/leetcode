# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I will need Math.min function fo find square
# Approach
<!-- Describe your approach to solving the problem. -->
We found Math.min() of every rectangle, and calculated max square of all rectangles. Then using stream api we counted amount of max square rectangles.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
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
```