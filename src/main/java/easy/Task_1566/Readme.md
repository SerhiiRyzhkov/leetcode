# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Probably, we will need inner loop to resolve the problem, and the complexity will be O(n^2)
# Approach
<!-- Describe your approach to solving the problem. -->
We resolve the problem in two steps. First step: using while loop we search for all possible inner arrays that match to m and k params. Second step: inside while loop we check current inner array if the input array contain the current array.  

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n^2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        if(m*k>arr.length)return false;
        int [] temp = new int[m*k];

        int l=0;
        while (l!=arr.length-m+1){
            int index=0;
            for(int j=0;j<k;j++) {
                for (int i = l; i < m + l; i++)
                    temp[index++] = arr[i];
            }
            
            int stop=0;
            index=0;
            for(int j=0;j<arr.length;j++) {
                if (arr[j] == temp[index]) {
                    index++;
                    stop=j;
                }
                else {
                    index = 0;
                    j=stop++;
                }
                if (index == temp.length) return true;
            }
            l++;
        }


        return false;
    }
}
```