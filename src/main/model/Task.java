package main.model;

import java.sql.Time;

public class Task extends Timeslot {
    private PreferredTime prefTime;
    private Appointment before;
    private Appointment after;

    protected Task(String name, String amtTime) {
        super(name, amtTime);
    }

}
