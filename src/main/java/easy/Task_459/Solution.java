package easy.Task_459;



//Repeated Substring Pattern
//https://leetcode.com/problems/repeated-substring-pattern/
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (int i = s.length() / 2; i >= 1; i--) {
            if(l%i==0) {
                int middle = l/i;
                String sub = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < middle; j++)
                    sb.append(sub);
            if(sb.toString().equals(s)) return true;
        }
    }
    return false;
    }
}
