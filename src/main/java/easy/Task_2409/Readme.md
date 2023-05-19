# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We can use different strategies to resolve the problem: parsing input strings to Date, counting days after parsing input Strings to Integer values, brute force etc..

# Approach
<!-- Describe your approach to solving the problem. -->
We create method getDays(String date). This method returns the day of the year from string value. Knowing all days of the year we easily find the matching using two Set containers.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    private int [] year  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        Set<Integer> aliceDays = new HashSet<>();
        Set<Integer> bobDays = new HashSet<>();

        for(int i=getDays(arriveAlice);i<=getDays(leaveAlice);i++)
            aliceDays.add(i);
        for(int i=getDays(arriveBob);i<=getDays(leaveBob);i++)
            bobDays.add(i);

        aliceDays.retainAll(bobDays);

        return aliceDays.size();

    }

    private int getDays(String date){
        int result=0;
        int index=0;
        while (Integer.valueOf(date.split("-")[0])-1!=index)
        {
            result+=year[index++];
        }
        result+=Integer.valueOf(date.split("-")[1]);

        return result;

    }
}
```