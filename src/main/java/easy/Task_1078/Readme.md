# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We know that there are only words and spaces in the text, so we are able to use split method to resolve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
We transform input text to array using split method. Then we iterate over the array searching for second string. We skip the first and last values from the array - to avoid ArraysIndexOutOfBoundsException.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        String [] array = text.split(" ");
        List<String> list = new ArrayList<>();


        for(int i=1;i<array.length-1;i++)
            if((array[i].equals(second))&&(array[i-1].equals(first))) list.add(array[i+1]);

        return list.toArray(new String[0]);
    }
}
```