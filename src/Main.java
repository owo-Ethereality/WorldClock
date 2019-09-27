import java.util.*;

public class Main {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        Scanner in = new Scanner(System.in);
        String op;

        Clock bjClock = new Clock("BeijingClock",cal,0);
        Clock ldClock = new Clock("LondonClock",cal,8);
        Clock mcClock = new Clock("MoscowClock",cal,4);
        Clock snClock = new Clock("SydneyClock",cal,-2);
        Clock nyClock = new Clock("NewYorkClock",cal,13);

        while(true) {
            op = in.nextLine();
            if(op.equals("quit"))break;
            if(op.equals("set")) {
                System.out.println("请输入年月日时分秒，回车分隔");
                int year = Integer.parseInt(in.nextLine());
                int month = Integer.parseInt(in.nextLine());
                int day = Integer.parseInt(in.nextLine());
                int hour = Integer.parseInt(in.nextLine());
                int minute = Integer.parseInt(in.nextLine());
                int second = Integer.parseInt(in.nextLine());
                Calendar now = Calendar.getInstance();
                long cover = now.getTimeInMillis() - cal.getTimeInMillis();
                cal = now;
                bjClock.setTime(cover,year,month,day,hour,minute,second);
                ldClock.setTime(cover,year,month,day,hour,minute,second);
                mcClock.setTime(cover,year,month,day,hour,minute,second);
                snClock.setTime(cover,year,month,day,hour,minute,second);
                nyClock.setTime(cover,year,month,day,hour,minute,second);
            }
        }
    }
}
