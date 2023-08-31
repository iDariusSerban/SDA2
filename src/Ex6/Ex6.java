package Ex6;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Ex6 {
    public static void main(String[] args) {
        int year = 2017;
        int month = 9;
        System.out.println(calculateFirstAndLastDayOfMonth(year, month));

    }

    public static String calculateFirstAndLastDayOfMonth(int year, int month) {
        if (year < MIN_YEAR || year > MAX_YEAR || month < 1 || month > 12) {
            return "Invalid input. Year or month out of range";
        }
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate lastDayOfMonth = LocalDate.of(year, month, firstDayOfMonth.lengthOfMonth());

        String formattedFirstDay = firstDayOfMonth.toString();
        String formattedLastDay = lastDayOfMonth.toString();

        return formattedFirstDay + " " + formattedLastDay;
    }

    public static final int MIN_YEAR = 1900;
    public static final int MAX_YEAR = 2100;

}
