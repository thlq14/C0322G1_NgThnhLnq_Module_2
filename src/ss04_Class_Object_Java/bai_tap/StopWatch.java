package ss04_Class_Object_Java.bai_tap;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime, endTime;

//    public StopWatch() {
//        startTime = LocalTime.now();
//    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

//    public LocalTime getStartTime() {
//        return startTime;
//    }
//
//    public LocalTime getEndTime() {
//        return endTime;
//    }
//
//    public void start() {
//        startTime = LocalTime.now();
//    }
//
//    public void stop() {
//        endTime = LocalTime.now();
//    }

    public int getElapsedTime() {
        int miliSecond = ((endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()) * 1000);
        return miliSecond;
    }
}

class MainStopWatch {
    public static int[] selectionSort(int... a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        LocalTime start = LocalTime.now();
        System.currentTimeMillis();
        a = selectionSort(a);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start, end);
        System.out.println("Time: " + stopWatch.getElapsedTime() + " milisecond.");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
        }
    }
}

