package main.model;

import java.sql.Time;

public abstract class Timeslot {
    private String name;
    private Time startTime;
    private Time amtTime;
    private Time endTime;

    protected Timeslot(String name, Time startTime, Time amtTime, Time endTime){
        this.name = name;
        this.startTime = startTime;
        this.amtTime = amtTime;
        this.endTime = endTime;
    }
    public  void setStartTime(Time startTime){
        this.startTime = startTime;
    }
    public Time getStartTime(){
        return this.startTime;
    }
    public  void setAmtTime(Time amtTime){
        this.amtTime = amtTime;
    }
    public Time getAmtTime() {
        return this.amtTime;
    }

    public void setEndTime(Time endTime){
        this.endTime = endTime;
    }
    public Time getEndTime(){
        return this.endTime;
    }
}
