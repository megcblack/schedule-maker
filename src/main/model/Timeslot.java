package main.model;

import java.sql.Time;
//import model.TimeSchedule;
public abstract class Timeslot {
    private String name;
    private TimeSchedule startTime;
    private TimeSchedule amtTime;
    private TimeSchedule endTime;

    protected Timeslot(String name, TimeSchedule startTime, TimeSchedule amtTime, TimeSchedule endTime){
        this.name = name;
        this.startTime = startTime;
        this.amtTime = amtTime;
        this.endTime = endTime;
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
