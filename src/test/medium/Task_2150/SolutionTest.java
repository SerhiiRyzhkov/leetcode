package medium.Task_2150;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {10,6,5,8};
    List<Integer> result11 = Arrays.asList(10,8);
    List<Integer> result12 = Arrays.asList(8,10);

    int [] nums2 = {1,3,5,3};
    List<Integer> result21 = Arrays.asList(1,5);
    List<Integer> result22 = Arrays.asList(5,1);


    @Test
    void findLonely1() {
        assertTrue(solution.findLonely(nums1).equals(result11)||solution.findLonely(nums1).equals(result12));
    }

    @Test
    void findLonely2() {
        assertTrue(solution.findLonely(nums2).equals(result21)||solution.findLonely(nums2).equals(result22));
    }
}