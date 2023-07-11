package easy.Task_2744;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String [] nums1 = {"cd","ac","dc","ca","zz"};

    String [] nums2 = {"ab","ba","cc"};

    String [] nums3 = {"aa","ab"};

    @Test
    void maximumNumberOfStringPairs1() {
        assertEquals(2,solution.maximumNumberOfStringPairs(nums1));
    }

    @Test
    void maximumNumberOfStringPairs2() {
        assertEquals(1,solution.maximumNumberOfStringPairs(nums2));
    }

    @Test
    void maximumNumberOfStringPairs3() {
        assertEquals(0,solution.maximumNumberOfStringPairs(nums3));
    }

}