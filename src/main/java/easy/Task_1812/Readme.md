# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
If we represent letters of cells as numbers - we are able to interpret them in solution
# Approach
<!-- Describe your approach to solving the problem. -->
So, firstly we need transform chars to numbers - to separate cells to even and odd cells. Then we see, that a cell - it is 97 odd, b cell - it is 98 even, c cell it is 99 odd etc. Then we can realize. That all black cells we get only when we have combination odd+odd or even+even, otherwise we get a white cell. So we just need to check if a letter and a number mean odd or even numbers - and we are able to determine a color of the cell.  
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean squareIsWhite(String coordinates) {
        return (int)coordinates.charAt(0)%2!=
                Character.getNumericValue(coordinates.charAt(1))%2; 
    }
}
```