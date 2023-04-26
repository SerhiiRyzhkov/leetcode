# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I will need to create alphabet like hashMap (Chararcter - Number of appearances) of licensePlate word. Also, I will need to create a list of suitable words and then choose the first and the shortest word there.
# Approach
<!-- Describe your approach to solving the problem. -->
First step: I create alphabet:  hashMap (Chararcter - Number of appearances);
Second step: I create a similar alphabet from every word from input array and check if the word is suitable. If the words suits I add the word to suitable List. Then I return the first the shortest word from the list.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n^2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        List<String> suitable = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<licensePlate.length();i++) {
         char ch = licensePlate.charAt(i);
            if ((ch > 64)&&(ch<91)) {
                if(map.containsKey((char) (ch + 32)))
                    map.put((char) (ch + 32),map.get((char) (ch + 32))+1);
                else map.put((char) (ch + 32),1);
            }
            if ((ch > 96)&&(ch<123)) {
                if(map.containsKey(ch))
                    map.put(ch,map.get(ch)+1);
                else map.put(ch,1);
            }
        }

        for (String s : words) {
            char[] word = s.toCharArray();
            Map<Character, Integer> wordMap = new HashMap<>();
            for (char c : word) {
                if (wordMap.containsKey(c)) wordMap.put(c, wordMap.get(c) + 1);
                else wordMap.put(c, 1);
            }
            boolean suits = true;
            for (Character el : map.keySet()) {

                if ((!wordMap.containsKey(el)) || (wordMap.remove(el) < map.get(el))) {
                    suits = false;
                    break;
                }
            }
            if (suits)
                suitable.add(s);
        }



        suitable.sort(Comparator.comparingInt(String::length));

        return suitable.get(0);
    }
}
```