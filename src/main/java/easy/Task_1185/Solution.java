package easy.Task_1185;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//  Day of the Week
//  https://leetcode.com/problems/day-of-the-week/
public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String dateString = day+"-"+month+"-"+year;
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return switch (date.getDay()) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 0 -> "Sunday";
            default -> "";
        };

    }
}