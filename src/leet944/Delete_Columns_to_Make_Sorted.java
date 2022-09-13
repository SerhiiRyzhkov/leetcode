package leet944;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Delete_Columns_to_Make_Sorted {
    public static void main(String[] args) {
        String[] strs = {"zyx", "wvu", "tsr"};
        System.out.println(minDeletionSize(strs));
    }

    public static int minDeletionSize(String[] strs) {

        int count = 0;
        List<Character>[] array = new List[strs[0].length()];
        for (int i = 0; i < strs[0].length(); i++)
            array[i] = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[j].add(strs[i].charAt(j));
            }
        }


        for (int i = 0; i < array.length; i++) {
            List<Character> compare = new ArrayList<>(array[i]);
            Collections.sort(compare);
            if (!array[i].equals(compare)) count++;
        }

        return count;
    }
}

/*
  System.out.println(array[0]);

        System.out.println(array[1]);

        System.out.println(array[2]);
 */