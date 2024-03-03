package model;
public class TimeSchedule {
    private int hour;
    private int minute;
    private int [] time;
    private static final int MAXHOUR = 24;
    private static final int MAXMINUTE = 60;
    public TimeSchedule(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.time = new int[2];
        time[0] = hour;
        time[1] = minute;

    }
    public int[] timeDifference(int[] time1, int[] time2){
        int sum1 = time1[0]*MAXMINUTE + time1[1];
        int sum2 = time2[0]*MAXMINUTE + time2[1];
        int ans = sum2 - sum1;
        int hour = ans/60;
        int minute = ans%60;
        int[] t = new int[2];
        t[0] = hour;
        t[1] = minute;
        return t;
    }
    public int[] getTime(){
        int[] t = new int[2];
        t[0] = time[0];
        t[1] = time[1];
        return t;
    }

    public String toString(){
        return this.hour + ":" + this.minute;
    }
}
