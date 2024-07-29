# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We do not have any ways to resolve a problem without considering 3 options k>0,k=0 and k<0 separately
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input array. Then, according to k value we move left or right from of each element and using sum var we add numbers to result. Count var helps us to make k moves over the input array. When k>0 we go right, else if k<0 we go left over the array. And the easiest case when k=0, then we need to return a new int[].
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] decrypt(int[] code, int k) {
        int [] result = new int[code.length];
            for(int i=0;i<code.length;i++){
                int count=k;
                int sum=0;
                if(k>0) {
                    for (int j = i + 1; count > 0; j++) {
                        count--;
                        if (j < code.length) sum += code[j];
                        else {
                            sum += code[0];
                            j = 0;
                        }
                    }
                }
                else if(k<0){
                    for(int j=i-1;count<0;j--){
                        count++;
                        if(j>=0)sum+=code[j];
                        else {
                            sum+=code[code.length-1];
                            j=code.length-1;
                        }
                    }
                }
                result[i]=sum;
            }

        return result;
    }
}
```