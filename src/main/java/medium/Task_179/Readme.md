# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should create a comparator to sort input array numbers in correct way
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we transform input array to List<String>, then we create a comparator where we use BigInteger object. The next step: we sort the list using the comparator. And then using stringbuilder we create output string. We need while loop to "kill" zero numbers in the beginning of the output string.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n log n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
import java.math.BigInteger;
class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) list.add(String.valueOf(num));

        Comparator<String> comparator = (o1, o2) -> {
            BigInteger bigInteger1 = new BigInteger(o1+o2+"");
            BigInteger bigInteger2 = new BigInteger(o2+o1+"");
            return  bigInteger2.compareTo(bigInteger1);
        };

        list.sort(comparator);

        StringBuilder sb = new StringBuilder();

        list.forEach(sb::append);



        while ((sb.charAt(0)=='0')&&(sb.length()>1))
        {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
```