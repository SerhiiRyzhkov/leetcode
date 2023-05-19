package easy.Task_470;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [] nums1={2,5,1,3,4,7};
    int n1 =3;
    int [] result1 = {2,3,5,4,1,7};

    int [] nums2={1,2,3,4,4,3,2,1};
    int n2 =4;
    int [] result2 = {1,4,2,3,3,2,4,1};

    int [] nums3={1,1,2,2};
    int n3 =2;
    int [] result3 = {1,2,1,2};

    @Test
    void shuffle1() {
        assertArrayEquals(solution.shuffle(nums1,n1),result1);
    }

    @Test
    void shuffle2() {
        assertArrayEquals(solution.shuffle(nums2,n2),result2);
    }

    @Test
    void shuffle3() {
        assertArrayEquals(solution.shuffle(nums3,n3),result3);
    }
}