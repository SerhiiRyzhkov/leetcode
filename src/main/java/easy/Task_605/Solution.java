package easy.Task_605;

// Can Place Flowers
// https://leetcode.com/problems/can-place-flowers/
public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for(int i=0;i<flowerbed.length;i++)
        {
            if(available(flowerbed,i-1)&&available(flowerbed,i)&&available(flowerbed,i+1))
            {
                flowerbed[i]=1;
                n--;
            }
            if(n<1)return true;
        }

        return false;
    }

    private boolean available(int [] flowerbed, int i)
    {
        if(i<0)return true;
        if(i==flowerbed.length)return true;
        return flowerbed[i] != 1;
    }
}