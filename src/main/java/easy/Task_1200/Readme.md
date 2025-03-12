# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to sort the array to find minimal difference.
# Approach
<!-- Describe your approach to solving the problem. -->
We sort the input array and find the minimal distance using Math method min. Then we create result List and begin to fill that. We iterate over the sorted array again and write down to the result list all the pairs with the minimal difference that we have found before.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++)
            min=Math.min(min,arr[i]-arr[i-1]);

        List<List<Integer>> result = new ArrayList<>();

        for(int i=1;i<arr.length;i++)
            if(arr[i]-arr[i-1]==min)result.add(new ArrayList<>(List.of(arr[i-1],arr[i])));
        return result;
    }
}
```