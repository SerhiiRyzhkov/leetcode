# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to check if a triangle exists and count amount of distinct sides.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we check if a triangle exist. We know that a triangle can not exit if  sum of his any two sides equals or bigger that the thirds side. To check it we sort the input array. We are aware that a length of the input array is three, so we can use sort method with O(1) complexity. After sorting, we know that the last element of the array is the biggest side, so we can check if the triangle exist. Then, we have to define the type of the triangle. To do it, we have to count distinct sides. It`s convenient to do that is using switch-case construction. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2]) return "none";
        return switch ((int)(Arrays.stream(nums).distinct().count())){
            case 1 -> "equilateral";
            case 2 -> "isosceles";
            default -> "scalene";
        };
    }
}
```