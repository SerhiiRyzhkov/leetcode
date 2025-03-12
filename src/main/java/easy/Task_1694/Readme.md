# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It is convenient to use Stringbuilder to resolve the problem
# Approach
<!-- Describe your approach to solving the problem. -->
We create stringbuilder and write down there only digits from the input string. Then we work only with them, so we need to write down digits into string var, and clear stringbuilder var, because we will need in after that. Then we iterate over the number string and check how many digits left in a number. We have 4 cases and regarding the case we append to stringbuilder digits with "-". If we have 3 digits or >3 digits we append three digits, otherwise we append two digits.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String reformatNumber(String number) {

        StringBuilder sb = new StringBuilder();
        for(Character ch: number.toCharArray()) if(ch<58&&ch>47)sb.append(ch);
        number=sb.toString();
        sb=new StringBuilder();


        for(int i=0;i<number.length();i++)
        {
            int left = number.length()-i;
            if(left>4)
            sb.append(number.charAt(i++)).append(number.charAt(i++)).append(number.charAt(i)).append("-");
            else if (left==3)
                sb.append(number.charAt(i++)).append(number.charAt(i++)).append(number.charAt(i));
            else if(left==4)
                sb.append(number.charAt(i++)).append(number.charAt(i++)).append("-").append(number.charAt(i++)).append(number.charAt(i));
            else if(left==2)
                sb.append(number.charAt(i++)).append(number.charAt(i));
        }

        return sb.toString();
    }
}
```