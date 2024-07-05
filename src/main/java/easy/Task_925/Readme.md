# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
    Probably, I need to separate typed word into parts of words with the same letters.
# Approach
<!-- Describe your approach to solving the problem. -->
    We create an additional method separate(), that separate a word to a list of words, where each the word contains the same letters. Then we compare two lists. The necessary conditions to claim that a typed word is long pressed name are: 
    1)sizes of two lists have to be the same. 
    2)letters in words in both lists have to be the same
    3)sizes of words in typeList have to be bigger or the same with the sizes of words in nameList.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isLongPressedName(String name, String typed) {

        List<String> listName = separate(name);
        List<String> listType = separate(typed);

        if (listName.size() != listType.size())
            return false;

        for (int i = 0; i < listName.size(); i++)
            if ((listType.get(i).length() < listName.get(i).length()) ||
                    listType.get(i).charAt(0) != listName.get(i).charAt(0))
                return false;

        return true;
    }

    private List<String> separate(String word) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        sb.append(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(i - 1)) {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
            sb.append(word.charAt(i));
        }
        list.add(sb.toString());
        return list;
    }
}

```