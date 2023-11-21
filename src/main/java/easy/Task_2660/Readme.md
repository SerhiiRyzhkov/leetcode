# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We just need iterate over the both input array and calculate summary scores
# Approach
<!-- Describe your approach to solving the problem. -->
We create add method countScore. In that score, using var count we calculate summary score. We need var count to observe the next 2 hits after 10. Then we just compare scores of two players.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int isWinner(int[] player1, int[] player2) {
        if(countScore(player1)>countScore(player2))return 1;
        else if(countScore(player1)<countScore(player2))return 2;
        else return 0;
    }

    private int countScore(int [] arr){
        int result=0;
        int count=0;
        for (int j : arr) {
            result += j;
            if (count>0) {result += j;count--;}
            if (j == 10) count = 2;
        }
        return result;
    }
}
```