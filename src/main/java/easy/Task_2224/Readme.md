# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Regarding the fact that we have String input values we will need to parse them to int and transform them in minutes.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we transform string values to int values in minutes. Then we create array with the values that we are allowed to use in operations. And starting from the biggest allowed value, we increase current time until it equals to correct time. Amount of operations will be the answer.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int convertTime(String current, String correct) {
        int result=0;

        int cur = Integer.parseInt(current.substring(0,2))*60+Integer.parseInt(current.substring(3,5));

        int cor = Integer.parseInt(correct.substring(0,2))*60+Integer.parseInt(correct.substring(3,5));

        int [] time = {60,15,5,1};

        for(int i=0;i<time.length;i++){
            while (cor-cur>=time[i])
            {
                result++;
                cur+=time[i];
            }
        }
        return result;
    }
}
```