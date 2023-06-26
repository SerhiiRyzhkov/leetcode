# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should use while or for loop whe every iteration will be the visiting of one plant.
# Approach
<!-- Describe your approach to solving the problem. -->
We create var can that means our watering can. Then, we create for loop, where every iteration means one step to the next plant. If we have enough water to pour a plant we just increment result value and write down the new value of can. If we do not have enough water we add steps to the result value regarding value i. We add exactly amount of steps to come back for water and return to a plant. Also, we fill up the can regarding it`s capacity. Finally, we return result value where we have written down total amount of steps.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {

    public int wateringPlants(int[] plants, int capacity) {
        int result=0;
        int can=capacity;
        for(int i = 0; i<plants.length;i++ )
            if(plants[i]<=can){
                result++;
                can-=plants[i];
            }
            else {
                result+=i*2+1;
                can=capacity-plants[i];
            }


        return result;
    }
}
```