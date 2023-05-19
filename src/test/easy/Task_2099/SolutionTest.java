package easy.Task_2099;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [] nums1={2,1,3,3};
    int k1 =2;
    int [] result1 = {3,3};

    int [] nums2={-1,-2,3,4};
    int k2 =3;
    int [] result2 = {-1,3,4};

    int [] nums3={3,4,3,3};
    int k3 =2;
    int [] result3 = {4,3};

    int [] nums4={50,-75};
    int k4 =2;
    int [] result4 = {50,-75};

    int [] nums5={63,-74,61,-17,-55,-59,-10,2,-60,-65};
    int k5 =9;
    int [] result5 = {63,61,-17,-55,-59,-10,2,-60,-65};

    int [] nums6 = {1};

    int k6 = 1;

    int [] result6 = {1};

    @Test
    void maxSubsequence1() {
        assertArrayEquals(solution.maxSubsequence(nums1,k1),result1);
    }

    @Test
    void maxSubsequence2() {
        assertArrayEquals(solution.maxSubsequence(nums2,k2),result2);
    }

    @Test
    void maxSubsequence3() {
        assertArrayEquals(solution.maxSubsequence(nums3,k3),result3);
    }

    @Test
    void maxSubsequence4() {
        assertArrayEquals(solution.maxSubsequence(nums4,k4),result4);
    }

    @Test
    void maxSubsequence5() {
        assertArrayEquals(solution.maxSubsequence(nums5,k5),result5);
    }

    @Test
    void maxSubsequence6() {
        assertArrayEquals(solution.maxSubsequence(nums6,k6),result6);
    }
}