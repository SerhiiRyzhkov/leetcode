package easy.Task_766;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int [][] matrix1 = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};

    int [][] matrix2 = {{1,2},{2,2}};


    @Test
    void isToeplitzMatrix1() {
        assertTrue(solution.isToeplitzMatrix(matrix1));
    }


    @Test
    void isToeplitzMatrix2() {
        assertFalse(solution.isToeplitzMatrix(matrix2));
    }
}