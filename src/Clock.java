import java.util.*;

public class Clock {
    int year;
    int month;
    int day;
    int hour;
    int minute;
    int second;
    Clock() {

    }
    Clock(Calendar cal) {
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        hour = cal.get(Calendar.HOUR_OF_DAY);
        minute = cal.get(Calendar.MINUTE);
        second = cal.get(Calendar.SECOND);
    }
}
