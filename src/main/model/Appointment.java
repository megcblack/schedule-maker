package main.model;

import java.sql.Time;

public class Appointment extends Timeslot{
    public Appointment(String name, String startTime, String endTime){
        super(name, startTime, endTime);
        int[] amtTime = TimeSchedule.timeDifference(super.getStartTime().getTime(), super.getEndTime().getTime());
        super.setAmtTime(amtTime);
    }

    public void setTimeAmount(TimeSchedule starTime, TimeSchedule endTime){

    }

}
