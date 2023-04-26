# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I am not supposed to parse input Stings, so the obvious way is the using Stringbuilder objects
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly I am founding the sum of digits from the end to begin. Then I consider few options according to input numbers.
First if: if the amount of numbers in answer is equals to amount of numbers in num1 and num2.
Second if: if the amount of numbers in input nums is not equal to amount of numbers in answer. But amount numbers in num1 and num2 are the same.
Third if: if amount of numbers in num1 and num2 is different.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        StringBuilder sb3 = new StringBuilder();

        int a;
        int b;
        int c;
        boolean addOne=false;

        while ((sb1.length()>0)&&(sb2.length()>0))
        {
            a=Character.getNumericValue(sb1.charAt(sb1.length()-1));
            b=Character.getNumericValue(sb2.charAt(sb2.length()-1));
            if(addOne)c=1;
            else c=0;

            sb1.deleteCharAt(sb1.length() - 1);
            sb2.deleteCharAt(sb2.length() - 1);

            if(a + b + c>=10)
            {
                sb3.insert(0, (a + b + c - 10));
                addOne=true;
            }
            else
            {
                sb3.insert(0, a + b + c);
                addOne=false;
            }
        }


        StringBuilder result = new StringBuilder();

        if(!addOne)return result.append(sb1).append(sb2).append(sb3).toString();

        if((sb1.length()==0)&&(sb2.length()==0))return result.append("1").append(sb3).toString();

        if(sb1.length()>sb2.length())
            result.append(sb1);
        else result.append(sb2);

        for(int i=result.length()-1;i>=0;i--)
        {
            char n = result.charAt(i);
            if(n!='9'){
                result.setCharAt(i,(char)(n+1));
                return result.append(sb3).toString();
            }
            else result.setCharAt(i,'0');
        }


        return 1+result.toString()+sb3.toString();
    }
}
```