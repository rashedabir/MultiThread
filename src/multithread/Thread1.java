package multithread;

import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author rashed
 */
public class Thread1 extends TimerTask {

    Date now;

    // Add your task here
    @Override
    public void run() {
        now = new Date();
        System.out.println("Calling on each sec. Time is :" + now);
    }
}
