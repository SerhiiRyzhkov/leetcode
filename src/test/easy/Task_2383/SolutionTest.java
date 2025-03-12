package easy.Task_2383;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    int initialEnergy1 =5;
    int initialExperience1 =3;
    int [] energy1 = {1,4,3,2};
    int [] experience1 = {2,6,3,1};

    int initialEnergy2 =2;
    int initialExperience2 =4;
    int [] energy2 = {1};
    int [] experience2 = {3};

    @Test
    void minNumberOfHours1() {
        assertEquals(8,solution.minNumberOfHours(initialEnergy1,initialExperience1,energy1,experience1));
    }

    @Test
    void minNumberOfHours2() {
        assertEquals(0,solution.minNumberOfHours(initialEnergy2,initialExperience2,energy2,experience2));
    }



}