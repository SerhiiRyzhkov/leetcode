package easy.Task_867;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    int [][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
    int [][] output1 = {{1,4,7},{2,5,8},{3,6,9}};

    int [][] matrix2 = {{1,2,3},{4,5,6}};
    int [][] output2 = {{1,4},{2,5},{3,6}};

    @Test
    void transpose1() {
        assertArrayEquals(output1,solution.transpose(matrix1));
    }

    @Test
    void transpose2() {
        assertArrayEquals(output2,solution.transpose(matrix2));
    }
}