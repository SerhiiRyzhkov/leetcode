package easy.Task_1071;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  Greatest Common Divisor of Strings
//  https://leetcode.com/problems/greatest-common-divisor-of-strings/
public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        List<String> prefixes = new ArrayList<>();
        for(int i=0;i<Math.min(str1.length(),str2.length());i++)
            if(str1.charAt(i)==str2.charAt(i)) {
                sb.append(str1.charAt(i));
                prefixes.add(sb.toString());
            }
            else break;


        for(int i=prefixes.size()-1;i>=0;i--)
            if (str1.split(prefixes.get(i)).length == 0 && str2.split(prefixes.get(i)).length == 0)
                return prefixes.get(i);


        return "";
    }
}