package main.model;

public abstract class Timeslot {
    private String name;
    private TimeSchedule startTime;
    private TimeSchedule amtTime;
    private TimeSchedule endTime;

    protected Timeslot(String name, String sTime, String eTime){
        this.name = name;
        this.startTime = new TimeSchedule(sTime);    //Creates start time
        this.endTime = new TimeSchedule(eTime);    //Creates end time
        int[] time = TimeSchedule.timeDifference(startTime.getTime(),endTime.getTime());
        this.amtTime = new TimeSchedule(time[0], time[1]);    //Creates amount of time
    }
    protected Timeslot(String name, String amtTime){
        this.name = name;
        this.amtTime = new TimeSchedule(amtTime);
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
