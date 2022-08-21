package leet1678;

import java.util.Arrays;

public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String command = "GGG";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        command = command.replaceAll("\\(", " (");
        command = command.replaceAll("\\)", ") ");
        command = command.replaceAll("G", "G ");
        String[] array = command.split(" ");
        StringBuilder sb = new StringBuilder();

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("G")) sb.append("G");
            if (array[i].equals("(al)")) sb.append("al");
            if (array[i].equals("()")) sb.append("o");
        }


        return sb.toString();
    }
}
