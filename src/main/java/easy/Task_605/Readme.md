# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We just need iterate over the array and search for empty slots
# Approach
<!-- Describe your approach to solving the problem. -->
According to the fact we have to consider the first and the last position not as the common case, we create private method. The logic in that method checks if the spot is empty. There we also consider indexes -1 and length+1 as empty slots. Then we just iterate over the input array and set a plant when we find a suitable spot. If we are able to set all the plants we return true, otherwise we return false. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
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
```