# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We have to end a part when we don`t have any of symbols from the part further in the string. In this way we will be able to separate string to maximal amount of parts.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we create List container where we will write down result values. Then we create hashmap container where we keep all symbols from the input string and amount of their appearance in the string and fill the hashmap. Then we iterate over the string and add every char to a set and increment count var. Also, we decrease in the hashmap container amount of the symbol. If we get 0 in hashmap to every element of the set - it means, that we don`t have these symbols further in the string. It means, we have to write down count var to result list and start to cont a new part. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>result = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
        else map.put(s.charAt(i),map.get(s.charAt(i))+1);

        int count=0;

        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            set.add(ch);
            map.put(ch,map.get(ch)-1);
            count++;
            if (set.stream().filter(el->map.get(el)>0).toList().size()==0){
                result.add(count);
                count=0;
            }
        }

        return result;
    }
}
```