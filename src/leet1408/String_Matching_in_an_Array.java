package leet1408;

import java.util.ArrayList;
import java.util.List;

public class String_Matching_in_an_Array {
    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};
        System.out.println(stringMatching(words));

    }

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) continue;
                if (((words[j].indexOf(words[i])) >= 0) && (!result.contains(words[i])))
                    result.add(words[i]);
            }
        }
        return result;
    }
}
