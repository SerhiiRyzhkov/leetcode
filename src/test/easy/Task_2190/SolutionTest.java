package easy.Task_2190;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [] nums1 = {1,100,200,1,100};
    int key1 = 1;

    int [] nums2 = {2,2,2,2,3};
    int key2 = 2;

    @Test
    void mostFrequent1() {
        assertEquals(solution.mostFrequent(nums1,key1),100);
    }

    @Test
    void mostFrequent2() {
        assertEquals(solution.mostFrequent(nums2,key2),2);
    }
}