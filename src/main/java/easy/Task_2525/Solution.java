package easy.Task_2525;

// Categorize Box According to Criteria
// https://leetcode.com/problems/categorize-box-according-to-criteria/
public class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        boolean heavy = false;

        if(length>=10000||width>=10000||height>=10000||((long) width*length*height>=Math.pow(10,9)))bulky=true;
        if (mass>=100) heavy=true;

        if(bulky&&heavy) return "Both";
        if(!bulky&&!heavy)return "Neither";
        if(bulky) return "Bulky";
        else return "Heavy";
    }
}