package easy.Task_415;

//Add Strings
//https://leetcode.com/problems/add-strings/
public class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        StringBuilder sb3 = new StringBuilder();

        int a;
        int b;
        int c;
        boolean addOne = false;

        while ((sb1.length() > 0) && (sb2.length() > 0)) {
            a = Character.getNumericValue(sb1.charAt(sb1.length() - 1));
            b = Character.getNumericValue(sb2.charAt(sb2.length() - 1));
            if (addOne) c = 1;
            else c = 0;

            sb1.deleteCharAt(sb1.length() - 1);
            sb2.deleteCharAt(sb2.length() - 1);

            if (a + b + c >= 10) {
                sb3.insert(0, (a + b + c - 10));
                addOne = true;
            } else {
                sb3.insert(0, a + b + c);
                addOne = false;
            }
        }


        StringBuilder result = new StringBuilder();

        if (!addOne) return result.append(sb1).append(sb2).append(sb3).toString();


        if ((sb1.length() == 0) && (sb2.length() == 0)) return result.append("1").append(sb3).toString();


        if (sb1.length() > sb2.length())
            result.append(sb1);
        else result.append(sb2);

        for (int i = result.length() - 1; i >= 0; i--) {
            char n = result.charAt(i);
            if (n != '9') {
                result.setCharAt(i, (char) (n + 1));
                return result.append(sb3).toString();
            } else result.setCharAt(i, '0');
        }
        return 1 + result.toString() + sb3;
    }
}