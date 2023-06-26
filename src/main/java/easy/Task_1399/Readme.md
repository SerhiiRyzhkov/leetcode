# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need to build groups in some way according to the problem description.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we build List of lists where every list is the group where every element has the same sum of its digits. To reach that we use additional method getSum() that returns sum of digits of any number. Iterating over the array we also find out the maximal group`s length in the list. Finally, all that we need is to return number of groups with the maximal length. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int countLargestGroup(int n) {
            int maxSize=0;
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0;i<=n;i++){
            int s = getSum(i);

            if(lists.size()<=s) lists.add(new ArrayList<>());
            lists.get(s).add(i);
            if(lists.get(s).size()>maxSize)maxSize=lists.get(s).size();
        }

        lists.remove(0);
        int finalMaxSize = maxSize;
        return (int) lists.stream().filter(el->el.size()==finalMaxSize).count();
    }
     private int getSum(int n){
        int sum=0;
        while (n>=10) {
            sum += n % 10;
            n/= 10;
        }
        sum+=n;
        return sum;
    }
}
```