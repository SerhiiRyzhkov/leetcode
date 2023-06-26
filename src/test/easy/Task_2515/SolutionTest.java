package easy.Task_2515;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String [] words1 = {"hello","i","am","leetcode","hello"};
    String target1 = "hello";
    int startIndex1=1;

    String [] words2 = {"a","b","leetcode"};
    String target2 = "leetcode";
    int startIndex2=0;

    String [] words3 = {"i","eat","leetcode"};
    String target3 = "ate";
    int startIndex3=0;

    @Test
    void closetTarget1() {
        assertEquals(1,solution.closetTarget(words1,target1,startIndex1));
    }


    @Test
    void closetTarget2() {
        assertEquals(1,solution.closetTarget(words2,target2,startIndex2));
    }


    @Test
    void closetTarget3() {
        assertEquals(-1,solution.closetTarget(words3,target3,startIndex3));
    }
}