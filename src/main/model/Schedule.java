package main.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;

import static main.model.PreferredTime.MORNING;

public class Schedule {

    private static TimeSchedule[] times;
    private static final int SLOTS = 96;
    private Timeslot[] schedule;
    private ArrayList<Appointment> appointments;
    private ArrayList<Task> tasks;



    private static void setTimesArray () {
        TimeSchedule[] times = new TimeSchedule[SLOTS];
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
        tasks = new ArrayList<Task>();
        schedule = new Timeslot[SLOTS];
    }

    public void addAppointment(Appointment appt) {
        for (int i = 0; i < SLOTS; i++) {
            if (appt.getStartTime().compareTo( times[i]) <= 0
                && appt.getEndTime().compareTo( times[i]) > 0) {
                schedule[i] = appt;
            }
        }
        appointments.add(appt);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void addTaskToSchedule(Task t) {
        for (int i = 0; i < SLOTS; i++) {
            if (schedule[i] == null) {

            }
        }
    }
 /*   public Timeslot[] createSchedule() {
        for (Task t: tasks) {
            if (t.getPrefTime() == MORNING) {
                addTaskToSchedule(t);
            }
        }
    } */
    public static void main(String[] args) {
        setTimesArray();
        Schedule schedule = new Schedule();
        Appointment appt = new Appointment("myappt", "9:00", "10:30");
        schedule.addAppointment(appt);
        for (int i = 0; i < SLOTS; i++) {
            System.out.println(times[i] + " " + schedule.schedule[i]);
        }

    }
}
