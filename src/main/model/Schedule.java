package main.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Schedule {

    private static String[] times;
    private static ArrayList<Appointment> appointments;


    private static void setTimesArray () {
        String[] times = new String[96];
        for(int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 45; j+=15) {
                times[4*i + (j/15)] = i + ":" + j;
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
        for (String s: times) {

        }

    }
}
