package easy.Task_1309;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//  Decrypt String from Alphabet to Integer Mapping
//  https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!='#')
            sb.append(decode(String.valueOf(s.charAt(i))));
            else {
                sb.append(decode(s.charAt(i - 2) + "" + s.charAt(i - 1)));
                i-=2;
            }
        }

          return sb.reverse().toString();
    }

    private String decode(String d){
        return String.valueOf((char) (96 + Integer.parseInt(d)));
    }
}