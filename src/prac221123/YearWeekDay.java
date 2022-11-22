package prac221123;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;



public class YearWeekDay {
    public String solution(int a, int b) {
        String answer = "";

        LocalDate someday = LocalDate.of(2016,a,b);
        DayOfWeek dow = someday.getDayOfWeek();
        String needUpper = dow.getDisplayName(TextStyle.SHORT, Locale.US);
        answer = needUpper.toUpperCase();

        return answer;
    }
}
