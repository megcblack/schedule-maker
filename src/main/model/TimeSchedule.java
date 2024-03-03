package main.model;

import java.util.Comparator;

public class TimeSchedule implements Comparable<TimeSchedule> {
    private int hour;
    private int minute;
    private int [] time;
    private static final int MAXHOUR = 24;
    private static final int MAXMINUTE = 60;

    int[] splitTime(String time){
        String[] stringTime = time.split(":");
        int[] hm = new int[2];
        hm[0] = Integer.parseInt(stringTime[0]);
        hm[1] = Integer.parseInt(stringTime[1]);

        return hm;
    }
    public TimeSchedule(String t){
        int hm[] = splitTime(t);
        this.hour = hm[0];
        this.minute = hm[1];
        this.time = new int[2];
        time[0] = hour;
        time[1] = minute;

    }
    public TimeSchedule(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        time = new int[2];
        time[0] = hour;
        time[1] = minute;
    }
    public static int[] timeDifference(int[] time1, int[] time2){
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

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public String toString(){
        return this.hour + ":" + this.minute;
    }

    @Override
    public int compareTo(TimeSchedule o) {
        int time1 = this.hour*MAXMINUTE + this.minute;
        int time2 = o.hour*MAXMINUTE + o.minute;
        return Integer.compare(time1, time2);
    }
}
