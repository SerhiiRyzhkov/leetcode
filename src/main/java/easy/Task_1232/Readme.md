# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We have two possible ways to resolve the problem. 1) Use vectors collinear check. 2) And use linear function y=kx+c
# Approach
<!-- Describe your approach to solving the problem. -->
I have decided to use linear function to resolve the problem. First of all we have to consider special cases:
1) When we have only two points - if we have only two points we return true because we can draw a straight line through any two points;
2) We check case when a line is parallel to axis Y, also we check if a line is parallel to axis X.
Then we calculate k and c in y=kx+c and check all the points if they suit to this equation.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2)return true;
        boolean axisY=true;
        boolean axisX=true;
        int a=coordinates[0][0];
        int b=coordinates[0][1];
        for(int i=0;i<coordinates.length;i++)
        {
            if(coordinates[i][0]!=a){axisX=false;break;}
        }
        if(axisX)return true;

        for(int i=0;i<coordinates.length;i++)
        {
            if(coordinates[i][1]!=b){axisY=false;break;}
        }
        if(axisY)return true;



        boolean result = true;

        int x=coordinates[0][0];
        int y=coordinates[0][1];
        int v=coordinates[1][0];
        int w=coordinates[1][1];

        double k=((double)(w)-y)/(v-x);
        double c=(double)(y)- (((double) (w)-y)/(v-x))*x;



        for(int i=0;i<coordinates.length;i++)
            if(coordinates[i][1]!=k*coordinates[i][0]+c) {
                result = false;
                break;
            }

        return result;
    }
}
```