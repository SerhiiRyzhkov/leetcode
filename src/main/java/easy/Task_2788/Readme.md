# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s classical task with using split method.
# Approach
<!-- Describe your approach to solving the problem. -->
We create result list and fill that using Stream Api. We split the input array with separator, then filter empty elements and add each element to result list. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        words.forEach(el->result.addAll(Stream.of(el.split("\\Q" + separator + "\\E")).filter(a->!a.equals("")).toList()));
        return result;

    }
}
```