package easy.Task_1886;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [][] mat1 = {{0,1},{1,0}};
    int [][] target1 = {{1,0},{0,1}};

    int [][] mat2 = {{0,1},{1,1}};
    int [][] target2 = {{1,0},{0,1}};

    int [][] mat3 ={{0,0,0},{0,1,0},{1,1,1}};
    int [][] target3 = {{1,1,1},{0,1,0},{0,0,0}};




    @Test
    void findRotation1() {
        assertTrue(solution.findRotation(mat1,target1));
    }


    @Test
    void findRotation2() {
        assertFalse(solution.findRotation(mat2,target2));
    }


    @Test
    void findRotation3() {
        assertTrue(solution.findRotation(mat3,target3));
    }
}