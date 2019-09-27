import java.util.*;

public class Main {

    public static void main(String[] args) {
        BjClock bj = new BjClock();
        LdClock ld = new LdClock();
        McClock mc = new McClock();
        NyClock ny = new NyClock();
        SnClock sn = new SnClock();
        while(true) {
            Calendar cal = Calendar.getInstance();
            bj.setTime(cal);
            ld.setTime(cal);
            mc.setTime(cal);
            ny.setTime(cal);
            sn.setTime(cal);
            System.out.print("\n\n\n\n\nBeijingClock:");
            bj.print();
            System.out.print("LondonClock:");
            ld.print();
            System.out.print("MexicoClock:");
            mc.print();
            System.out.print("NewYorkClock:");
            ny.print();
            System.out.print("SydneyClock:");
            sn.print();
            try{
                Thread.sleep(700);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
