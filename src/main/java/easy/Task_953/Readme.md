# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To avoid check all order string and search here for the char every time it`s easier to create Map where I will keep chars and their position.
# Approach
<!-- Describe your approach to solving the problem. -->
We create Map, where Key is character from order, and Value - it`s position. Then we iterate over the array and check every pair of words. If they in correct order. As soon we find, that some words in wrong order - we return false. Otherwise, return true.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<order.length();i++)
            map.put(order.charAt(i),i);

        for(int i=1;i< words.length;i++)
        {
            String word1 = words[i-1];
            String word2 = words[i];
            int min = Math.min(word1.length(), word2.length());
            for(int j = 0; j< min; j++)
            {
                if(map.get(word1.charAt(j))>map.get(word2.charAt(j)))return false;
                if(map.get(word1.charAt(j))<map.get(word2.charAt(j)))break;
                if((j== min -1)&&(word1.length()>word2.length()))return false;
            }
        }
        return true;
    }
}
```