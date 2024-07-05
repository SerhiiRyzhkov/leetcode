# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We could use Map to keep Integers and amount of arrays that keeps the Integer.
# Approach
<!-- Describe your approach to solving the problem. -->
We create a map, where we are going to keep all Integers and the amount of sets, that keep the Integer. Then, using Stream API we firstly delete from arrays all the duplicates, then we just write the information about the Integer to Map container. As a result, we have Map container that keeps the information about every Integer value from arrays. Key - is integer value, and Value is the amount the arrays that keeps the value. Finally, we have to return all the elements, with value >=2. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length)return new int[][] {};

        int [][] array = new int[m][n];
        int index = 0;

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++) 
                array[i][j] = original[index++];
        
        return array;
    }
}
```