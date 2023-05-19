package easy.Task_2341;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums1= {1,3,2,1,3,2,2};
    int [] result1= {3,1};

    int [] nums2= {1,1};
    int [] result2= {1,0};


    int [] nums3= {0};
    int [] result3= {0,1};


    @Test
    void numberOfPairs1() {
        assertArrayEquals(solution.numberOfPairs(nums1),result1);
    }

    @Test
    void numberOfPairs2() {
        assertArrayEquals(solution.numberOfPairs(nums2),result2);
    }


    @Test
    void numberOfPairs3() {
        assertArrayEquals(solution.numberOfPairs(nums3),result3);
    }


}