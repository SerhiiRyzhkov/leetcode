package easy.Task_1002;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    String [] words1 = {"bella","label","roller"};
    String [] words2 = {"cool","lock","cook"};

    @Test
    void commonChars1() {
        List<String> result = new ArrayList<>(List.of("e","l","l"));

        assertEquals(result.stream().sorted().collect(Collectors.toList()), solution.commonChars(words1).stream().sorted().collect(Collectors.toList()));

    }

    @Test
    void commonChars2() {
        List<String> result = new ArrayList<>(List.of("c","o"));
        assertEquals(result.stream().sorted().collect(Collectors.toList()), solution.commonChars(words2).stream().sorted().collect(Collectors.toList()));

    }
}