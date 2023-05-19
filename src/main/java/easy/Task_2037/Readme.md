# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To find minimal numbers of moves we should find most similar numbers from both arrays.
# Approach
<!-- Describe your approach to solving the problem. -->
We sort both arrays to work on every step with the most similar integers. After that we just add absolute value of the difference between two numbers on every step of iterating over the input arrays to result var.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nlogn)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int result = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for(int i=0;i<seats.length;i++)
            result+=Math.abs(seats[i]-students[i]);

        return result;
    }
}
```