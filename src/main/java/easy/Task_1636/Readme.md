# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I need to keep in some way frequencies of every value from input array. The best way to do that is using hashmap<Integer, Integer> (Value, Frequency). And then I will search ways to sort input arrays

# Approach
<!-- Describe your approach to solving the problem. -->
I created hashmap where I kept values and their frequencies. Then I needed to sort the array. So I created comparator where I described the logic how I could achieve a goal.

# Complexity
- Time complexity:
  O(n*log(n))

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
            if (hashmap.containsKey(num)) {
                hashmap.put(num, hashmap.get(num) + 1);
            } else {
                hashmap.put(num, 1);
            }
        }

        Comparator<Integer> comparator = (o1, o2) -> {
            if(hashmap.get(o1)>hashmap.get(o2))return 1;
            else if(hashmap.get(o1)<hashmap.get(o2))return -1;
            else return o2-o1;
        };

        list.sort(comparator);

        int [] result = new int[list.size()];
        for(int i=0;i<result.length;i++)
            result[i]=list.get(i);

        return result;
    }
}
```