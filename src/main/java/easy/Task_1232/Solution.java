package easy.Task_1232;


//  Check If It Is a Straight Line
//  https://leetcode.com/problems/check-if-it-is-a-straight-line/
public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2)return true;
        boolean axisY=true;
        boolean axisX=true;
        int a=coordinates[0][0];
        int b=coordinates[0][1];
        for (int[] ints : coordinates) {
            if (ints[0] != a) {
                axisX = false;
                break;
            }
        }
        if(axisX)return true;

        for (int[] coordinate : coordinates) {
            if (coordinate[1] != b) {
                axisY = false;
                break;
            }
        }
        if(axisY)return true;



        boolean result = true;

        int x=coordinates[0][0];
        int y=coordinates[0][1];
        int v=coordinates[1][0];
        int w=coordinates[1][1];

        double k=((double)(w)-y)/(v-x);
        double c=(double)(y)- (((double) (w)-y)/(v-x))*x;


        for (int[] coordinate : coordinates)
            if (coordinate[1] != k * coordinate[0] + c) {
                result = false;
                break;
            }

        return result;
    }
}