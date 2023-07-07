package easy.Task_412;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    int n1=3;
    List<String> answer1 = new ArrayList<>(Arrays.asList("1","2","Fizz"));

    int n2=5;
    List<String> answer2 = new ArrayList<>(Arrays.asList("1","2","Fizz","4","Buzz"));

    int n3=15;
    List<String> answer3 = new ArrayList<>(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"));

    @Test
    void fizzBuzz1() {
        assertEquals(answer1,solution.fizzBuzz(n1));
    }

    @Test
    void fizzBuzz2() {
        assertEquals(answer2,solution.fizzBuzz(n2));
    }

    @Test
    void fizzBuzz3() {
        assertEquals(answer3,solution.fizzBuzz(n3));
    }
}