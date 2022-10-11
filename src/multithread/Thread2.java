package multithread;

import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author rashed
 */
public class Thread2 extends TimerTask {

    Date now;

    // Add your task here
    @Override
    public void run() {
        now = new Date();
        System.out.println("Calling on each 2 sec. Time is :" + now);
    }
}
