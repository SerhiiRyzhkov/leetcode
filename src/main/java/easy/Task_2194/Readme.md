# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need to iterate chars, then integers and write all combinations to the result list.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly we parse the input string to integers and characters of cells. Then, using while loop we iterate char util we get char2. Inside while loop we use for loop where we iterate integers util we get integer of the second cell from the input string. Every result we write down to result list and return it.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<String> cellsInRange(String s) {
        char ch1 = s.charAt(0);
        char ch2 = s.charAt(3);
        int n1= s.charAt(1)-48;
        int n2= s.charAt(4)-48;
        
        List<String> result = new ArrayList<>();

        char ch = ch1;
        
        while (ch<=ch2) {
            for(int i=n1;i<=n2;i++)
                result.add(ch+""+i);
            ch++;
        }

        return result;
    }
}
```