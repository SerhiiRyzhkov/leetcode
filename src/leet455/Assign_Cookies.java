package leet455;

import java.util.Arrays;

public class Assign_Cookies {
    public static void main(String[] args) {
    int[]g ={1,2};
    int[]s ={1,2,3};
        System.out.println(findContentChildren(g,s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int a = 0 , b = 0;
        while(a<g.length && b<s.length)
        {
            if(g[a]<=s[b])
            {
                a++;
                b++;
            }
            else
            {
                b++;
            }
        }
        return a;
    }
}
