# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need to parse input data to Date format.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we convert input data to Date format. Regarding Date class doesn`t have getDayOfTheWeek method we use switch case where return the day of the week.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String dateString = day+"-"+month+"-"+year;
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(date.getDay());

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
```