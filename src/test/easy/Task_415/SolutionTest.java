package easy.Task_415;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String num1_1="11";
    String num2_1="123";
    String output1="134";

    String num1_2="456";
    String num2_2="77";
    String output2="533";

    String num1_3="0";
    String num2_3="0";
    String output3="0";


    @Test
    void addStrings1() {
        assertEquals(solution.addStrings(num1_1,num2_1),output1);
    }
    @Test
    void addStrings2() {
        assertEquals(solution.addStrings(num1_2,num2_2),output2);
    }
    @Test
    void addStrings3() {
        assertEquals(solution.addStrings(num1_3,num2_3),output3);
    }
}