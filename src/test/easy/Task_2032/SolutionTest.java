package easy.Task_2032;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int [] nums11 = {1,2,3,2};
    int [] nums21 = {2,3};
    int [] nums31 = {3};
    Set<Integer> set1 = new HashSet<>(Set.of(3,2));

    int [] nums12 = {3,1};
    int [] nums22 = {2,3};
    int [] nums32 = {1,2};
    Set<Integer> set2 = new HashSet<>(Set.of(2,3,1));

    int [] nums13 = {1,2,2};
    int [] nums23 = {4,3,3};
    int [] nums33 = {5};
    Set<Integer> set3 = new HashSet<>();

    @Test
    void twoOutOfThree1() {
        assertEquals(set1, new HashSet<>(solution.twoOutOfThree(nums11, nums21, nums31)));
    }

    @Test
    void twoOutOfThree2() {
        assertEquals(set2, new HashSet<>(solution.twoOutOfThree(nums12, nums22, nums32)));
    }

    @Test
    void twoOutOfThree3() {
        assertEquals(set3, new HashSet<>(solution.twoOutOfThree(nums13, nums23, nums33)));
    }
}