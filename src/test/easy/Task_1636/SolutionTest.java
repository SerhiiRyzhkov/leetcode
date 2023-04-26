package easy.Task_1636;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SolutionTest {

    Solution solution = new Solution();


    int [] nums1 = {1,1,2,2,2,3};
    int [] nums2 = {2,3,1,3,2};
    int [] nums3 = {-1,1,-6,4,5,-6,1,4,1};


    int [] result1 = {3,1,1,2,2,2};
    int [] result2 = {1,3,3,2,2};
    int [] result3 = {5,-1,4,4,-6,-6,1,1,1};

    @Test
    void frequencySort1() {
     assertArrayEquals(solution.frequencySort(nums1),result1);
    }

    @Test
    void frequencySort2() {
        assertArrayEquals(solution.frequencySort(nums2),result2);
    }

    @Test
    void frequencySort3() {
        assertArrayEquals(solution.frequencySort(nums3),result3);
    }

}