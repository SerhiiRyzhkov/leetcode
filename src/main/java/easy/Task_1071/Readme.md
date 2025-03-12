# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Split method would be useful to search for repeating subsequences.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we create List of prefixes where we are going to keep all the possible subsequences that we can search, starting with the smallest one. Using stringbuilder we create all the possible subsequences that we can use. We get the number of subsequences the same as amount of same chars in both strings. The last element of the list is the longest one. Consequently, we start to analyze strings with the longest possible subsequence of chars. Here split method helps us. If we both strings can be divided by some subsequence, we get empty arrays after splitting them with the subsequence. So, if we found that kind of subsequence we immediately return it.   
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        List<String> prefixes = new ArrayList<>();
        for(int i=0;i<Math.min(str1.length(),str2.length());i++)
            if(str1.charAt(i)==str2.charAt(i)) {
                sb.append(str1.charAt(i));
                prefixes.add(sb.toString());
            }
            else break;


        for(int i=prefixes.size()-1;i>=0;i--) 
            if (str1.split(prefixes.get(i)).length == 0 && str2.split(prefixes.get(i)).length == 0)
                return prefixes.get(i);
        

        return "";
    }
}
```