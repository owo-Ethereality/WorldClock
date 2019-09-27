import java.util.Calendar;

public class StdHallClock extends Clock {
    int offset;
    StdHallClock() {
        offset = 0;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR,cal.get(Calendar.HOUR) + offset);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        hour = cal.get(Calendar.HOUR_OF_DAY);
        minute = cal.get(Calendar.MINUTE);
        second = cal.get(Calendar.SECOND);
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
    void checkTime(BjClock bj,LdClock ld,McClock mc,NyClock ny,SnClock sn) {
        Calendar cal = Calendar.getInstance();
        setTime(cal);
        bj.setTime(cal);
        ld.setTime(cal);
        mc.setTime(cal);
        ny.setTime(cal);
        sn.setTime(cal);
    }
}