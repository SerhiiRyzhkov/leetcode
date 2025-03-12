# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to keep the correspondence with open brackets and their close analog. It`s convenient to keep them in hashmap container because they represent pairs. 
# Approach
<!-- Describe your approach to solving the problem. -->
We create two hashmap containers where keep open and close brackets and their pairs. Also, we need to write somewhere open brackets from the input string that we have to close and their order. So, we create a list needToBeClosed. Then we iterate over the input string and check if we get an open bracket or close bracket. If we get open bracket we just put it into the list and keep iterating. If we get open bracket we check if we need to close some bracket, if the last open bracket is the pair of the current close bracket. If both conditionals are true, we remove the last element from the list (because we just closed that bracket) and keep iterating. Otherwise, we understand that we have to return false. After iterating, we just need to be sure that we have closed all the brackets, and we don`t have any brackets to close in the list container. If the list is empty, it means we have closed all the brackets, so we return true. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isValid(String s) {
       Map<Character, Character> open = new HashMap<>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        Map<Character, Character> close = new HashMap<>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        List<Character> needToBeClosed = new ArrayList<>();

        for(int i=0;i<s.length();i++)
            if(open.containsKey(s.charAt(i)))
                needToBeClosed.add(s.charAt(i));
            else
                if((needToBeClosed.size()>0)&&(needToBeClosed.get(needToBeClosed.size()-1)==close.get(s.charAt(i))))
                    needToBeClosed.remove(needToBeClosed.size()-1);
                else return false;

        return needToBeClosed.isEmpty();
    }
}
```