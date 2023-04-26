# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Considering that we have two arrays, we will need to implement each to each check and use nested array.
# Approach
<!-- Describe your approach to solving the problem. -->
We initialize int count. Then using nested array we check every element of array1 with every element2. Boolean "flag" is a value, that show do the values satisfy the conditions. And if the flag=true we increment the counter.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n^2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count =0;

        for(int i=0;i<arr1.length;i++)
        {
            boolean flag = true;
            for(int j=0;j<arr2.length;j++){
                int distance = Math.abs(arr1[i]-arr2[j]);
                if(distance<=d) {flag=false; break;}
            }
            if(flag)count++;
        }

        return count;
    }
}

```