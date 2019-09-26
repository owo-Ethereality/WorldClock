import java.util.*;

public class ShowThread extends Thread {
    @Override
    public void run() {
        while(true) {
            Calendar cal = Calendar.getInstance();
            int s = cal.get(Calendar.SECOND);
            System.out.print("\n\n\n\n\n\n\n\n\n\n" + s);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
