package model;

import java.sql.Time;

public class Task extends Timeslot {
    private PreferredTime prefTime;
    private Appointment before;
    private Appointment after;

    protected Task(String name, Time startTime, Time amtTime, Time endTime) {
        super(name, startTime, amtTime, endTime);
    }

    @Override
    public void setStartTime(Time startTime) {

    }

    @Override
    public void setAmtTime(Time amtTime) {

    }

    @Override
    public void setEndTime(Time endTime) {

    }
}
