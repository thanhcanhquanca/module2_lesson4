package hop_3;

public class StopWatch {
    private long startTime ;
    private long endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }


    public long getStartTime() {
        return startTime;
    }


    public long getEndTime() {
        return endTime;
    }

    public long start(){
        return this.startTime = System.currentTimeMillis();
    }

    public long stop(){
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
       return this.endTime - this.startTime;

    }


}
