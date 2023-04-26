# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The solution has to be with array and add method() or with recursion
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly we transform every char from input string to int and write down int to stringbuilder. Then we call k times "convert" method where calculate sum from stringbuilder and write the sum to a new stringbuilder.
Finally, we got result, and all what we need - is to parse result to integer and return it.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n^2)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int getLucky(String s, int k) {

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
            sb.append(s.charAt(i)-96);


        System.out.println(sb);
        for(int i=0;i<k;i++)
        {
            sb=convert(sb);
        }
        return Integer.parseInt(sb.toString());


    }
    public StringBuilder convert(StringBuilder sb){
        int sum=0;
        for(int i=0;i<sb.length();i++)
            sum+=Character.getNumericValue(sb.charAt(i));
        
        return new StringBuilder().append(sum);
    }

}
```