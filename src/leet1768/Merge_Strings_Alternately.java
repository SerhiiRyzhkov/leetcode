package leet1768;

import java.util.LinkedList;
import java.util.Queue;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        Queue<Character> w1 = new LinkedList<>();
        Queue<Character> w2 = new LinkedList<>();
        for (int i = 0; i < word1.length(); i++)
            w1.add(word1.charAt(i));
        for (int i = 0; i < word2.length(); i++)
            w2.add(word2.charAt(i));

        StringBuilder stringBuilder = new StringBuilder();

        while ((!w1.isEmpty()) || (!w2.isEmpty())) {
            if (!w1.isEmpty())
                stringBuilder.append(w1.poll());
            if (!w2.isEmpty())
                stringBuilder.append(w2.poll());
        }


        return stringBuilder.toString();
    }
}
