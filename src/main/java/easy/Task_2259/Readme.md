# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need substring to resolve the problem
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we create comparator that sort a string array as numeric values. Then we write to a list all values without the input digit (all various). Then we just return the maximal element using the comparator.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String removeDigit(String number, char digit) {
        List<String> list = new ArrayList<>();

        Comparator<String> comparator = (o1, o2) -> {
            if (o1.length()!=o2.length())return Integer.compare(o1.length(),o2.length());
            else{
                int i= 0;
                while (o1.charAt(i)==o2.charAt(i)&&(i<o1.length()-1))i++;
                return Integer.compare(Character.getNumericValue(o1.charAt(i)),Character.getNumericValue(o2.charAt(i)));
            }
        };


        for(int i=0;i<number.length();i++)
            if(number.charAt(i)==digit)
                list.add((number.substring(0,i)+number.substring(i+1)));


        return list.stream().max(comparator).get();
    }
}
```