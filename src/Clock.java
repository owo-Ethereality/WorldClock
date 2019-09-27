import java.util.*;

public class Clock {
    String name;
    Calendar time;
    int year,month,day;
    int hour,minute,second;
    long offset;

    Clock(String name,Calendar cal,long offset) {
        try {
            this.time = Calendar.getInstance();
            this.name = name;
            this.offset = offset;
            this.time.setTimeInMillis(cal.getTimeInMillis() + offset * 3600 * 1000);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    void setTime(long cover,int year,int month,int day,int hour,int minute,int second) {
        try{
            time.setTimeInMillis(time.getTimeInMillis() + cover);
            System.out.print(name + "当前时间:");
            print();
            time.set(Calendar.YEAR,year);
            time.set(Calendar.MONTH,month);
            time.set(Calendar.DATE,day);
            time.set(Calendar.HOUR,hour);
            time.set(Calendar.MINUTE,minute);
            time.set(Calendar.SECOND,second);
            time.setTimeInMillis(time.getTimeInMillis() + offset * 3600 * 1000);
            System.out.print(name + "调整时间:");
            print();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void print() {
        year = time.get(Calendar.YEAR);
        month = time.get(Calendar.MONTH) + 1;
        day = time.get(Calendar.DAY_OF_MONTH);
        hour = time.get(Calendar.HOUR_OF_DAY);
        minute = time.get(Calendar.MINUTE);
        second = time.get(Calendar.SECOND);
        System.out.println(year + "-" + month + "-" + day + "     " + hour + ":" + minute + ":" + second);
    }

}
