# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to iterate over the input arrays and track both energy and experience for each opponent. This approach is a brute-force method: we solve the problem directly without using additional data structures like sets or maps. Since we process each element only once, this should be the fastest way to solve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over input arrays, and check each opponent. Firstly, we check if we have enough energy. If we do not, we restore energy and add that amount of horse to reach the necessary level of energy. Then, we do the same with experience. And finally, we set new levels for energy and experience after opponent defeating and move to the next opponent. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hours=0;
        for(int i=0;i<energy.length;i++){
            if(initialEnergy<=energy[i]){
                hours+=energy[i]-initialEnergy+1;
                initialEnergy=energy[i]+1;
            }
            if(initialExperience<=experience[i]){
                hours+=experience[i]-initialExperience+1;
                initialExperience=experience[i]+1;
            }
            initialEnergy-=energy[i];
            initialExperience+=experience[i];
        }

        return hours;
    }
}
```