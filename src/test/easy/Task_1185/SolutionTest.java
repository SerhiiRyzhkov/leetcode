package easy.Task_1185;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int day1 = 31;
    int month1 = 8;
    int year1 = 2019;

    int day2 = 18;
    int month2 = 7;
    int year2 = 1999;

    int day3 = 15;
    int month3 = 8;
    int year3 = 1993;


    @Test
    void dayOfTheWeek1() throws ParseException {
        assertEquals("Saturday",solution.dayOfTheWeek(day1,month1,year1));
    }

    @Test
    void dayOfTheWeek2() throws ParseException {
        assertEquals("Sunday",solution.dayOfTheWeek(day2,month2,year2));
    }

    @Test
    void dayOfTheWeek3() throws ParseException {
        assertEquals("Sunday",solution.dayOfTheWeek(day3,month3,year3));
    }
}