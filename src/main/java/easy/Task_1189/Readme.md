# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s classical task where we have to use HashMap container
# Approach
<!-- Describe your approach to solving the problem. -->
We create map container and put there all the chars from the input string and numbers of their appearance. Then we iterate over the "balloon" word and at every iteration we write to max var a new value, if it less than max value. We calculate how many chars contains the input word and according to it calculate new max value. Moreover, we have to consider chars "l" and "o", because we have to use these letter twice to form a word "balloon".
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maxNumberOfBalloons(String text) {
        char [] array = text.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<array.length;i++)
            map.put(text.charAt(i), map.containsKey(text.charAt(i)) ? map.get(text.charAt(i)) + 1 : 1);

        String example = "balloon";

        int max = Integer.MAX_VALUE;

        for(int i = 0;i<example.length();i++)
        {
            char ch = example.charAt(i);
            if(!map.containsKey(ch))return 0;
            if((ch=='l')||(ch=='o'))
                max= Math.min(max, map.get(ch)/2);
            else max=Math.min(max, map.get(ch));
        }

        return max;
        }
    }
```