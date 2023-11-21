# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We may iterate over the array and search for and search for two intervals with the maximal score
# Approach
<!-- Describe your approach to solving the problem. -->
We create hashmap where we keep indexes of '0' and '1' elements in the string. Then we iterate over the string and check both intervals. If score is bigger than max, we override max var. And, finally, return it.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maxScore(String s) {
        int max=0;

        Map<Integer,List<Integer>> map = new HashMap<>();
        map.put(0,new ArrayList<>());
        map.put(1,new ArrayList<>());

        for(int i = 0;i<s.length();i++)
            if(s.charAt(i)=='1')map.get(1).add(i);
        else map.get(0).add(i);


        for(int i=1;i<s.length();i++)
        {
            int current_sum=0;
            for(int j=0; j<map.get(0).size()&&map.get(0).get(j)<i;j++)
                current_sum++;

            for(int j=map.get(1).size()-1;j>=0&&map.get(1).get(j)>=i;j--)
                current_sum++;

            max=Math.max(current_sum,max);
        }
        
        return max;
      }
}
```