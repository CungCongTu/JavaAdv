package bai1_8;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int second, int hour, int minute) {
        setTime(hour,minute,second);
    }
    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) this.minute = minute;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setTime(int hour, int minute , int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }


}
