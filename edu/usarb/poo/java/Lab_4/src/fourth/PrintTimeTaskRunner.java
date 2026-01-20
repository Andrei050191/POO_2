package fourth;

import java.util.Calendar;

public class PrintTimeTaskRunner extends AbstractTaskRunner {
    @Override
    protected void afterTask() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Task executed at: " + calendar.getTime());
    }
}
