# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We can use map to keep information with every word and chars of that word.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we create map Map<String,Map<String,Integer>> where we keep every word from the input array and List of chars of that word and amount of every char in that word. Then we check every word and, using min var, search the appearance of chars in words and fill the result List.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<String> commonChars(String[] words) {
       List<String> result= new ArrayList<>();
        Map<String,Map<String,Integer>> map = new HashMap<>();
        Set<String> chars = new HashSet<>();


        for(String word: words){
            map.put(word,new HashMap<>());
            for(char ch: word.toCharArray()) {
                chars.add(String.valueOf(ch));
                map.get(word).merge(String.valueOf(ch), 1, Integer::sum);
            }
        }

        chars.forEach(el->{
            int min=Integer.MAX_VALUE;
            for(Map.Entry<String,Map<String,Integer>> m: map.entrySet()){
                if(!map.get(m.getKey()).containsKey(el))map.get(m.getKey()).put(el,0);
                min=Math.min(min,map.get(m.getKey()).get(el));
            }
            for(int i=0;i<min;i++)
                result.add(el);
        });

        return result;  
    }
}
```