import java.util.Calendar;

public class McClock extends Clock {
    int offset;
    McClock() {
        offset = 4;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR,cal.get(Calendar.HOUR) + offset);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        hour = cal.get(Calendar.HOUR_OF_DAY);
        minute = cal.get(Calendar.MINUTE);
        second = cal.get(Calendar.SECOND);
        System.out.println(hour);
    }
    void setTime(Calendar cal) {
        cal.set(Calendar.HOUR,cal.get(Calendar.HOUR) + offset);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        hour = cal.get(Calendar.HOUR_OF_DAY);
        minute = cal.get(Calendar.MINUTE);
        second = cal.get(Calendar.SECOND);
    }
}