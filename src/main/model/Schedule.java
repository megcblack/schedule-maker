package main.model;

public class Schedule {

    private static String[] times;


    private static void setTimesArray () {
        String[] times = new String[96];
        for(int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 45; j+=15) {
                times[4*i + (j/15)] = i + ":" + j;
            }
        }
        Schedule.times = times;
    }

    public static void main(String args[]) {
        setTimesArray();
        for (String s: times) {
            System.out.println(s + " ");
        }
    }
}
