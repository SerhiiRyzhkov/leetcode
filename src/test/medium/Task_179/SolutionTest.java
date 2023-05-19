package medium.Task_179;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1 = {10,2};

    int [] nums2 = {3,30,34,5,9};

    int [] nums3 = {34323,3432};

    int [] nums4 = {999999991,9};

    int [] nums5 = {0,0};

    int [] nums6 = {1000000000, 1000000000};

    @Test
    void largestNumber1() {
        assertEquals(solution.largestNumber(nums1),"210");
    }

    @Test
    void largestNumber2() {
        assertEquals(solution.largestNumber(nums2),"9534330");
    }

    @Test
    void largestNumber3() {
        assertEquals(solution.largestNumber(nums3),"343234323");
    }

    @Test
    void largestNumber4() {
        assertEquals(solution.largestNumber(nums4),"9999999991");
    }

    @Test
    void largestNumber5() {
        assertEquals(solution.largestNumber(nums5),"0");
    }

    @Test
    void largestNumber7() {
        String o1="1000000000";

        String o2="1000000000";

        BigDecimal bigDecimal = new BigDecimal(o1+o2+"");
        System.out.println(bigDecimal);
        assertEquals(solution.largestNumber(nums6),"10000000001000000000");

    }
}