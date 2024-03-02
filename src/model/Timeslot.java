package model;

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
    public abstract void setStartTime(Time startTime);
    public Time getStartTime(){
        return this.startTime;
    }
    public abstract void setAmtTime(Time amtTime);
    public Time getAmtTime() {
        return this.amtTime;
    }

    public abstract void setEndTime(Time endTime);
    public Time getEndTime(){
        return this.endTime;
    }
}
