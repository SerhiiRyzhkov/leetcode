package easy.Task_836;

// Rectangle Overlap
// https://leetcode.com/problems/rectangle-overlap/
public class Solution {
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