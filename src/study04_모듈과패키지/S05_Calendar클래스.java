package study04_모듈과패키지;

import java.util.Calendar;

public class S05_Calendar클래스 {

    public static void main(String[] args) {
        // YEAR : 년도, DAY_OF_MONTH : 한 달의 날짜, MONTH : 달(0~11), DAY_OF_WEEK : 한 주의 요일
        // HOUR : 시간(0~11), AM_PM : 오전인지 오후인지 구분, HOUR_OF_DAY : 24시간을 기준으로 한 시간
        // MINUTE : 분, SECOND : 초, MILLISECOND : 밀리초

        // Calendar 객체 생성 - 현재 날짜와 시간
        // Calendar 클래스는 추상 클래스이므로 getInstance() 메소드를 통해 객체 생성
        Calendar time = Calendar.getInstance();
		int year = time.get(Calendar.YEAR);
		int month = time.get(Calendar.MONTH) +1;
        // 날짜와 시간 설정하기
        time.clear();
        time.set(2016, 11, 25);
        time.set(Calendar.HOUR_OF_DAY, 20);
        time.set(Calendar.MINUTE, 30);
    }

}
