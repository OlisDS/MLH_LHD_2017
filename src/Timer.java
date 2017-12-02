import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Timer {

    void startTimer(int delaySeconds) {
        Executors.newSingleThreadScheduledExecutor().schedule(
                runnable,
                delaySeconds,
                TimeUnit.SECONDS);
    }

    public static final Runnable runnable = new Runnable() {
        @Override public void run() {
            System.out.println("Hello, world!");
        }
    };
}
