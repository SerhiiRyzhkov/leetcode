package easy.Task_2259;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Remove Digit From Number to Maximize Result
// https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
public class Solution {
    public String removeDigit(String number, char digit) {
        List<String> list = new ArrayList<>();

        Comparator<String> comparator = (o1, o2) -> {
            if (o1.length()!=o2.length())return Integer.compare(o1.length(),o2.length());
            else{
                int i= 0;
                while (o1.charAt(i)==o2.charAt(i)&&(i<o1.length()-1))i++;
                return Integer.compare(Character.getNumericValue(o1.charAt(i)),Character.getNumericValue(o2.charAt(i)));
            }
        };


        for(int i=0;i<number.length();i++)
            if(number.charAt(i)==digit)
                list.add((number.substring(0,i)+number.substring(i+1)));


        return list.stream().max(comparator).get();

    }
}