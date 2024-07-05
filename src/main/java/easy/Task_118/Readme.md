# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should create a List of lists and fill row by row using previous row.
# Approach
<!-- Describe your approach to solving the problem. -->
We know that every the first and the last elements of each row equals "1". So we create a List of lists and fill it with "0", however the last and the first elements in each row we set as "1".
We get something like that:
[1]
[1,1]
[1,0,1]
[1,0,0,1]
[1,0,0,0,1]
After that we iterate over the List again and fill every row using previous row (starting from the second row). We just get a sum of elements with the same index and index + 1 from the previous row. And then everything we need is return the List.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>(List.of(1)));
        for(int i=1;i<numRows;i++) {
            result.add(new ArrayList<>());
            result.get(i).add(1);
            for(int j=1;j<i;j++)
                result.get(i).add(0);
            result.get(i).add(1);
        }


        for(int i=2;i<numRows;i++)
            for(int j=1;j<result.get(i).size()-1;j++)
                result.get(i).set(j,result.get(i-1).get(j-1)+result.get(i-1).get(j));
            

        return result;
    }
}
```