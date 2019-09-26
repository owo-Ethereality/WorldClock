import java.util.*;

public class Main {

    public static void main(String[] args) {
        BjClock bjClock = new BjClock();
        LdClock ldClock = new LdClock();
        McClock mcClock = new McClock();
        NyClock nyClock = new NyClock();
        SnClock snClock = new SnClock();
        ShowThread showThread = new ShowThread();
        showThread.start();
    }
}
