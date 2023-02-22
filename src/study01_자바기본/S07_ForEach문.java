package study01_자바기본;

public class S07_ForEach문 {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        // for-each 문
        for (int i : num) {
            System.out.println(i);
        }

        // 나열 타입(enum)
        enum Week {월, 화, 수, 목, 금, 토, 일}
        for (Week day : Week.values())
            System.out.print(day + "요일 ");
    }

}
