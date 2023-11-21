# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
StringBuilder and split will help to resolve that.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we change every lowercase char to " ". Then we use Stream API. We split the word to array by " ". Then we delete all the empty elements of the array. And add them to Set to find only unique elements. The size of set container will be the answer. However, we have to resolve cases when "0" and "00000" are not unique elements. They are the same. So, we create an additional method. The method cut off all '0' chars from the start of every element. These method also helps us to determine "123" and "00123" as the same elements.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<word.length();i++)
            if (word.charAt(i) > 47 && word.charAt(i) < 58)
                sb.append(word.charAt(i));
            else sb.append(" ");


        Arrays.stream(sb.toString().split(" "))
                .filter(s -> !s.isEmpty())
                .forEach(el->set.add(zeroCut(el)));

        return set.size();
    }

    private String zeroCut(String s){
        int i=0;
        while (s.charAt(i)=='0') {
            i++;
            if (i >= s.length()) return "0";
        }
        return s.substring(i);
    }
}
```