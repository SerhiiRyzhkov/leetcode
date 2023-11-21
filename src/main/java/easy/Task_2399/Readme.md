# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Hashmap will be convenient to keep there letters and their positions
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we fill up hashmap. We put there letter and their position. If map already keep position we easily calculate a distance. After filling hashMap - we just iterate over the input array and check if the distance in hashmap equals to the distance in the array.  
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++)
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),i);
            else map.put(s.charAt(i),i-map.get(s.charAt(i))-1);



        for(int i=0;i<distance.length;i++)
        {
            if(!map.containsKey((char)(i+97)))continue;
            if(map.get((char)(i+97))!=distance[i])return false;
        }


        return true;
    }
}
```