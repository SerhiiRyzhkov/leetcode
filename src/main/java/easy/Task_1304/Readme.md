# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The solution depends on if n odd or even. 
# Approach
<!-- Describe your approach to solving the problem. -->
We create a result array. Then fill that. The main idea is: if n is even. We fill the array with pairs of the same numbers but different signs. If n is odd, then we do the same but the first element we set as 0.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] sumZero(int n) {

        int [] array = new int[n];

        int a=2;
        int start = n%2==0?0:1;

        for(int i=start;i<n;i=i+2) {
            a++;
            array[i] = a;
            array[i+1]=a*-1;
        }
        return array;
    }
}
```