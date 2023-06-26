# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Creating a table with every year could help to resolve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
We transform the input array into treemap (year-population changing). Regarding the fact that years in treemap container are sorted, we are able to iterate over the treemap and observe the changing of population in every year. All we need is to return the year with a maximal value. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> map = new TreeMap<>();
        int max=0;
        int current=0;
        int year=0;

        for (int[] log : logs) {
            for (int j = 0; j < log.length; j++) {
                if (!map.containsKey(log[j])) map.put(log[j], 0);
                if (j == 0) map.put(log[j], map.get(log[j]) + 1);
                else map.put(log[j], map.get(log[j]) - 1);
            }
        }
        

        for(Map.Entry<Integer,Integer> m: map.entrySet()) {
            current += m.getValue();
            if(current > max) {
                max = current;
                year=m.getKey();
            }
        }

        return year;
    }
}
```