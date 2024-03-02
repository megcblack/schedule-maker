package model;

import java.sql.Time;

public class Appointment extends Timeslot{
    public Appointment(String name, Time startTime, Time endTime){
        super(name, startTime, null, endTime);
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
