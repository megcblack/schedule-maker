package main.model;

public abstract class Timeslot {
    private String name;
    private TimeSchedule startTime;
    private TimeSchedule amtTime;
    private TimeSchedule endTime;

    int[] splitTime(String time){
        String[] stringTime = time.split(":");
        int[] hm = new int[2];
        hm[0] = Integer.parseInt(stringTime[0]);
        hm[1] = Integer.parseInt(stringTime[1]);

        return hm;
    }
    protected Timeslot(String name, String sTime, String eTime){
        this.name = name;
        int[] hm = splitTime(sTime);
        int[] hm2 = splitTime(eTime);
        this.startTime = new TimeSchedule(hm[0], hm[1]);
        this.endTime = new TimeSchedule(hm2[0], hm2[1]);
    }
    protected Timeslot(String name, String amtTime){
        this.name = name;
        int[] hm = splitTime(amtTime);
        this.amtTime = new TimeSchedule(hm[0], hm[1]);
    }
    public  void setStartTime(TimeSchedule startTime){
        this.startTime = startTime;
    }
    public TimeSchedule getStartTime(){
        return this.startTime;
    }
    public  void setAmtTime(TimeSchedule amtTime){
        this.amtTime = amtTime;
    }
    public TimeSchedule getAmtTime() {
        return this.amtTime;
    }

    public void setEndTime(TimeSchedule endTime){
        this.endTime = endTime;
    }
    public TimeSchedule getEndTime(){
        return this.endTime;
    }
}
