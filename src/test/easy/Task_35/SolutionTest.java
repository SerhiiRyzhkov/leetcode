package easy.Task_35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [] nums = {1,3,5,6};

    int target1=5;

    int target2=2;

    int target3=7;

    @Test
    void searchInsert1() {
        assertEquals(2,solution.searchInsert(nums,target1));
    }

    @Test
    void searchInsert2() {
        assertEquals(1,solution.searchInsert(nums,target2));
    }

    @Test
    void searchInsert3() {
        assertEquals(4,solution.searchInsert(nums,target3));
    }
}