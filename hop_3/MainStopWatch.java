package hop_3;

import java.util.Scanner;

public class MainStopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StopWatch stopwatch = new StopWatch();

        System.out.println("Stopwatch started at: " + stopwatch.getStartTime() + " ms");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stopwatch.stop();
        System.out.println("Stopwatch stopped at: " + stopwatch.getEndTime() + " ms");

        System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + " ms");
    }
}
