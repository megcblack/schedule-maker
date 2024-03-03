package model;

import java.sql.Time;

public class Appointment extends Timeslot{
    public Appointment(String name, TimeSchedule startTime, TimeSchedule endTime){
        super(name, startTime, null, endTime);
    }

    public void setTimeAmount(){

    }

}
