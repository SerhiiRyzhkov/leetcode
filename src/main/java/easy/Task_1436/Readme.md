# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Collections like Map or Set could help us to solve problem
# Approach
<!-- Describe your approach to solving the problem. -->
We fill two sets: set with all the cities and set with cities which have an output path. Then we return the city without output path using removeAll() method.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> allCities = new HashSet<>();
        Set<String> pathCities = new HashSet<>();

        for(int i=0;i < paths.size();i++)
        {
            allCities.add(paths.get(i).get(1));
            pathCities.add(paths.get(i).get(0));
        }

        allCities.removeAll(pathCities);
        return allCities.stream().findFirst().get();
    }
}
```