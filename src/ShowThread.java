import java.util.*;

public class ShowThread extends Thread {
    private BjClock bjClock;
    private LdClock ldClock;
    private McClock mcClock;
    private NyClock nyClock;
    private SnClock snClock;

    ShowThread(BjClock bj,LdClock ld,McClock mc,NyClock ny,SnClock sn) {
        bjClock = bj;
        ldClock = ld;
        mcClock = mc;
        nyClock = ny;
        snClock = sn;
    }

    @Override
    public void run() {
        while(true) {
            System.out.print("\n\n\n\n\nBeijingClock:");
            bjClock.print();
            System.out.print("LondonClock:");
            ldClock.print();
            System.out.print("MexicoClock:");
            mcClock.print();
            System.out.print("NewYorkClock:");
            nyClock.print();
            System.out.print("SydneyClock:");
            snClock.print();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
