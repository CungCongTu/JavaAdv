package Bai3_4;

public class MyTime {

    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Not valid hour's value"); // Ngoai le
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Not valid minute's value");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Not valid second's value");
        }
        this.second = second;
    }

    public MyTime nextSecond(){
        second = 0;
        return nextMinute();
    }

    public MyTime nextMinute(){
        minute = 0;
        return nextHour();
    }

    public MyTime nextHour(){
        hour = 0;
        return this;
    }

    public MyTime previousSecond(){
        second = 59;
        return previousMinute();
    }

    public MyTime previousMinute() {
        minute = 59;
        return previousHour();
    }

    public MyTime previousHour() {
        hour = 23;
        return this;
    }
}