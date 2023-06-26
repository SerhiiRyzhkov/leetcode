# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
According to the task, we will need to parse Int values to String values probably using stringbuilder. Also, we will need use some binary operations.
# Approach
<!-- Describe your approach to solving the problem. -->
We have 12 hours and 60 minutes. So we iterate over arrays with these numbers. Then we have to count bits of every number using method bitCount and check if the amount of bits equals to the input value. Regarding the fact that we don`t have 16 hours on our watch we have to exclude this bit. We can do it using binary AND(&). 11101111 or 239 will always keep 0 in 4th bit. To transform int to sting we use an additional method timeFormat. We, using stringbuilder, transform all integers values to the final look and add them to the final List.     
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List readBinaryWatch(int num) {
        List<String>result = new ArrayList<>();
        for(int i=0;i<12;i++)
        {
            for(int j=0;j<60;j++)
            {
                if(Integer.bitCount(i&239)+Integer.bitCount(j)==num)
                    result.add(timeFormat(i,j));
            }
        }

        return result;
    }
    private String timeFormat(int hours, int minutes){
        StringBuilder sb = new StringBuilder();
        sb.append(hours).append(":");
        if(minutes<10)sb.append(0);
        sb.append(minutes);
        return sb.toString();
    }
}
```