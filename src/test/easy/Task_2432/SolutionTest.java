package easy.Task_2432;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int n1=10;
    int [][] logs1 = {{0,3},{2,5},{0,9},{1,15}};

    int n2=26;
    int [][] logs2 = {{1,1},{3,7},{2,12},{7,17}};

    int n3=2;
    int [][] logs3 = {{0,10},{1,20}};

    @Test
    void hardestWorker1() {
        assertEquals(solution.hardestWorker(n1,logs1),1);
    }
    @Test
    void hardestWorker2() {
        assertEquals(solution.hardestWorker(n2,logs2),3);
    }
    @Test
    void hardestWorker3() {
        assertEquals(solution.hardestWorker(n3,logs3),0);
    }
}