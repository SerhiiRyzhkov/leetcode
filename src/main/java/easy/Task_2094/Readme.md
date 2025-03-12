# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Firstly, I thought about bruteforce, but it was too difficult. So, I decided just to iterate over all three-elements integers. 
# Approach
<!-- Describe your approach to solving the problem. -->
We, transform the input array into a list. It`s much convenient with list. Then we iterate over the integers from 100 to 1000 and check each of them. On each iteration we create temp list - the temporary copy of the list with digits. We need a copy because we plan to delete elements from the copy on each iteration. Then, we check all the conditionals. We check if the integer is even (c%2), if the integer without leading zeros (a!=0) and we check if our temporary list keeps all the digits. If all conditionals are true, we need to write down the integer to the result list. Finally, we just return the result list.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer>list = Arrays.stream(digits).boxed().toList();

        List<Integer>result = new ArrayList<>();
        for(int i=100;i<1000;i++){
            List<Integer> temp = new ArrayList<>(list);
            int a = Character.getNumericValue(String.valueOf(i).charAt(0));
            int b = Character.getNumericValue(String.valueOf(i).charAt(1));
            int c = Character.getNumericValue(String.valueOf(i).charAt(2));
            if(a!=0&&c%2==0&&temp.remove((Integer)a)&&temp.remove((Integer)b)&&temp.remove((Integer)c))result.add(i);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
```