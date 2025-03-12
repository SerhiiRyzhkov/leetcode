package easy.Task_2383;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//  Minimum Hours of Training to Win a Competition
//  https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition/
public class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hours=0;
        for(int i=0;i<energy.length;i++){
            if(initialEnergy<=energy[i]){
                hours+=energy[i]-initialEnergy+1;
                initialEnergy=energy[i]+1;
            }
            if(initialExperience<=experience[i]){
                hours+=experience[i]-initialExperience+1;
                initialExperience=experience[i]+1;
            }
            initialEnergy-=energy[i];
            initialExperience+=experience[i];
        }

        return hours;
    }
}