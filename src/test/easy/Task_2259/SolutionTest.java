package easy.Task_2259;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String number1 = "123";
    char digit1 = '3';

    String number2 = "1231";
    char digit2 = '1';

    String number3 = "551";
    char digit3 = '5';


    @Test
    void removeDigit1() {
        assertEquals("12",solution.removeDigit(number1,digit1));
    }

    @Test
    void removeDigit2() {
        assertEquals("231",solution.removeDigit(number2,digit2));
    }

    @Test
    void removeDigit3() {
        assertEquals("51",solution.removeDigit(number3,digit3));
    }
}