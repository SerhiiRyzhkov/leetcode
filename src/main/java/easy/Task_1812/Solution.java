package easy.Task_1812;

import java.util.*;

// Determine Color of a Chessboard Square
// https://leetcode.com/problems/determine-color-of-a-chessboard-square/
public class Solution {
    public boolean squareIsWhite(String coordinates) {
        return (int)coordinates.charAt(0)%2!=
                Character.getNumericValue(coordinates.charAt(1))%2;
    }
}