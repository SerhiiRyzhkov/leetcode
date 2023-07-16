# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s comfortable to keep all the visits in an array, because index of the array will show us a number of sector.
# Approach
<!-- Describe your approach to solving the problem. -->
We create array, where 0-index we do not use, and other indexes means the sector. Then we iterate over the input array and increment sectors values in the sectors array. In that time we also define max value. Then we write all sectors in the array that have maximal numbers of visits to the result List and return it.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int [] sectors = new int[n+1];
        int current = rounds[0];
        int max=0;

        for(int i=0;i<rounds.length;i++){

            if(i==rounds.length-1){
                sectors[current]++;
                if(sectors[current]>max)max=sectors[current];
                break;
            }
            while (current!=rounds[i+1]){
                sectors[current]++;
                if(sectors[current]>max)max=sectors[current];
                if(++current>n)current=1;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i =1;i<sectors.length;i++)
            if(sectors[i]==max)result.add(i);

        return result;
    }
}
```