package leet680;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Valid_Palindrome_II {
    public static void main(String[] args) {
    String s = "cbbcc";
   /* StringBuilder sb = new StringBuilder(s);
    sb=sb.delete(2,3);
        System.out.println(sb);*/


        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        if (s.length() == 1) return true;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder rev_sb = new StringBuilder(s);
        rev_sb.reverse();
         for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != s.charAt(s.length() - 1-i)){
                sb.delete(i, i+1);
                rev_sb.delete(i, i+1);
                break;
            }

        StringBuilder one = new StringBuilder(sb);
        one.reverse();
        StringBuilder two = new StringBuilder(rev_sb);
        two.reverse();

            return one.toString().equals(sb.toString())||two.toString().equals(rev_sb.toString());
    }

}


/*
System.out.println("list:"+list);
            System.out.println("rev_list"+list_reverse);
            System.out.println("i="+i);
            System.out.println("work_char:"+list.get(i));
            System.out.println("list i="+list.get(i));
            System.out.println("list_rev="+list_reverse.get(i));
            System.out.println("-----------");


            System.out.println("sb:"+sb.charAt(i));
                System.out.println("sb_r:"+rev_sb.charAt(sb.length()-i));
 */