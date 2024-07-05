package easy.Task_1773;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    List<List<String>> items1 = new ArrayList<>(List.of(
            new ArrayList<>(List.of("phone", "blue", "pixel")),
            new ArrayList<>(List.of("computer", "silver", "lenovo")),
            new ArrayList<>(List.of("phone", "gold", "iphone"))
    ));
    String ruleKey1 = "color";
    String ruleValue1 = "silver";

    List<List<String>> items2 = new ArrayList<>(List.of(
            new ArrayList<>(List.of("phone", "blue", "pixel")),
            new ArrayList<>(List.of("computer", "silver", "phone")),
            new ArrayList<>(List.of("phone", "gold", "iphone"))
    ));
    String ruleKey2 = "type";
    String ruleValue2 = "phone";

    @Test
    void countMatches1() {
        assertEquals(1,solution.countMatches(items1,ruleKey1,ruleValue1));
    }


    @Test
    void countMatches2() {
        assertEquals(2,solution.countMatches(items2,ruleKey2,ruleValue2));
    }
}