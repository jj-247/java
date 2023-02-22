package test04_모듈과패키지;

import java.util.Calendar;

public class Q01_캘린더 {

    // Calendar 사용하기
    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();
        int hour_of_day = time.get(Calendar.HOUR_OF_DAY);
        int hour = time.get(Calendar.HOUR);
        int minute = time.get(Calendar.MINUTE);
        System.out.printf("현재 시간은 %d시 %d분입니다. %n", hour, minute);
        if (hour >= 4 && hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good Afternoon");
        } else if (hour >= 18 && hour < 22) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }

}
