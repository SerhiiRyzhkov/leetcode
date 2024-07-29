package easy.Task_2788;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Split Strings by Separator
// https://leetcode.com/problems/split-strings-by-separator/
public class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        words.forEach(el->result.addAll(Stream.of(el.split("\\Q" + separator + "\\E")).filter(a->!a.equals("")).toList()));
        return result;

    }
}