package easy.Task_1436;



import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    List<List<String>> paths1 = Arrays.asList(Arrays.asList("London","New York"),
            Arrays.asList("New York","Lima"),Arrays.asList("Lima","Sao Paulo"));

    List<List<String>> paths2 = Arrays.asList(Arrays.asList("B","C"),Arrays.asList("D","B"),Arrays.asList("C","A"));

    List<List<String>> paths3 = Arrays.asList(Arrays.asList("A","Z"));


    @Test
    void destCity1() {
    assertEquals(solution.destCity(paths1),"Sao Paulo");
    }

    @Test
    void destCity2() {
        assertEquals(solution.destCity(paths2),"A");
    }

    @Test
    void destCity3() {
        assertEquals(solution.destCity(paths3),"Z");
    }
}