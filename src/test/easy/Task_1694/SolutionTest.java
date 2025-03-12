package easy.Task_1694;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String number1 = "1-23-45 6";

    String number2 = "123 4-567";

    String number3 = "123 4-5678";

    @Test
    void reformatNumber1() {
        assertEquals("123-456", solution.reformatNumber(number1));
    }

    @Test
    void reformatNumber2() {
        assertEquals("123-45-67", solution.reformatNumber(number2));
    }

    @Test
    void reformatNumber3() {
        assertEquals("123-456-78", solution.reformatNumber(number3));
    }
}