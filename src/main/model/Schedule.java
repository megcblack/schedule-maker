package main.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;

public class Schedule {

    private static TimeSchedule[] times;
    private static ArrayList<Appointment> appointments;


    private static void setTimesArray () {
        TimeSchedule[] times = new TimeSchedule[96];
        for(int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 45; j+=15) {
                times[4*i + (j/15)] = new TimeSchedule(i + ":" + j);
            }
        }
        Schedule.times = times;
    }

    public Schedule() {
        setTimesArray();
        appointments = new ArrayList<Appointment>();
    }

    public void addAppointment() {

    }
    public static void main(String[] args) {
        setTimesArray();
        for (TimeSchedule s: times) {
            System.out.println(s);
        }

    }
}
