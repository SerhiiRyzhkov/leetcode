package easy.Task_2788;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    List<String> words1 = List.of("one.two.three", "four.five", "six");
    char separator1 = '.';
    List<String> result1 = List.of("one","two","three","four","five","six");

    List<String> words2 = List.of("$easy$","$problem$");
    char separator2 = '$';
    List<String> result2 = List.of("easy","problem");

    List<String> words3 = List.of("|||");
    char separator3 = '|';
    List<String> result3 = new ArrayList<>();

    @Test
    void splitWordsBySeparator1() {
    assertEquals(result1,solution.splitWordsBySeparator(words1,separator1));
    }

    @Test
    void splitWordsBySeparator2() {
        assertEquals(result2,solution.splitWordsBySeparator(words2,separator2));
    }

    @Test
    void splitWordsBySeparator3() {
        assertEquals(result3,solution.splitWordsBySeparator(words3,separator3));
    }
}