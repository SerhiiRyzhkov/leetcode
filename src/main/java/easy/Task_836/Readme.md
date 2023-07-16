# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Classical task with checking intervals.
# Approach
<!-- Describe your approach to solving the problem. -->
First of all we need to find possible intervals of the intersection. So we calculate {x_start,x_stop}, {y_start,y_end}. It will help uu to be in time limit. Then we check axis X using for loop. We iterate inside possible interval of the intersection and look for 2 points of intersection. If we get 2 points we go to Y axis checking, otherwise we return false, because we know, that intersection has to be on both axis. We check Y axis at the same way. And if we find intersection at the both axis we return true.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity: 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x_start = Math.max(rec1[0],rec2[0]);
        int y_start = Math.max(rec1[1],rec2[1]);

        int x_stop = Math.min(rec1[2],rec2[2]);
        int y_stop = Math.min(rec1[3],rec2[3]);
        
        int count=0;
        
        for(int i=x_start;i<=x_stop;i++)
        {
            if(i>=rec1[0]&&i<=rec1[2]&&i>=rec2[0]&&i<=rec2[2])count++;
            if(count==2)break;
        }
        
        if(count!=2)return false;
        else count=0;
        
        for(int i=y_start;i<=y_stop;i++)
        {
            if(i>=rec1[1]&&i<=rec1[3]&&i>=rec2[1]&&i<=rec2[3])count++;
            if(count==2) return true;
            
        }

        return false;
    }
}
```