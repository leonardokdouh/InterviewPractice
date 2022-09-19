import java.util.Calendar;
import java.util.Locale;


/**
 * You are given a date. You just need to write the method
 * which returns the day on that date.
 *
 */

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println(findDay(9, 11, 2022));
    }

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        String dayName = cal.getDisplayName(Calendar.DAY_OF_WEEK,
                Calendar.LONG, Locale.US).toUpperCase();
        return dayName;
    }
}
