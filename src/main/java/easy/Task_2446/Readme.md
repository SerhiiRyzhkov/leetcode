# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to find a way to interpret String values of time as Integers or Time values.
# Approach
<!-- Describe your approach to solving the problem. -->
We create an additional method getTimeNum(String s). That method transform String values with time to integer values of time. Then we iterate from 00:00 to 24:00 and check the states of two events. We use two boolean vars. Those vars mean a state of the event: true - events in progress, false events has not started or has finished. If we find any time when both events are true we return true. Otherwise, we return false.  
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        boolean ev1 = false;
        boolean ev2 = false;

        for (int i=0;i<2400;i++)
        {
            if(getTimeNum(event1[0])==i)ev1=true;
            if(getTimeNum(event2[0])==i)ev2=true;
            if(ev1&&ev2)return true;
            if(getTimeNum(event2[1])==i)ev2=false;
            if(getTimeNum(event1[1])==i)ev1=false;

        }
        return false;
    }

    private int getTimeNum(String s){
        int num=0;
        num+=Character.getNumericValue(s.charAt(0))*1000;
        num+=Character.getNumericValue(s.charAt(1))*100;
        num+=Character.getNumericValue(s.charAt(3))*10;
        num+=Character.getNumericValue(s.charAt(4));
        return num;
    }
}
```