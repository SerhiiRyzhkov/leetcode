# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The fastest way to resolve the problem will be using simple if-else solution
# Approach
<!-- Describe your approach to solving the problem. -->
We just iterate util reach n value. And add to result list a string according to index of loop.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();

        for(int i=1;i<=n;i++)
        {
            if((i%3==0)&&(i%5==0))result.add("FizzBuzz");
            else if (i%3==0) result.add("Fizz");
            else if (i%5==0) result.add("Buzz");
            else result.add(String.valueOf(i));
        }

        return result;
    }
}
```