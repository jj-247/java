package study01_자바기본;

import java.util.Scanner;

public class S02_Scanner {

    public static void main(String[] args) {
        // 입력기 -> 바이트 표준 입력 스트림 -> 스캐너 -> 자바 응용프로그램
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();
        // next()
        // nextInt()
        // next Line()
        // hasNext() : 현재 입력된 토큰이 있으면 true, 아니면 입력 때까지 무한정 대기, 새로운 입력이 들어올 때 true 리턴, ctrl-z가 입력되면 입력 끝이므로 false 리턴
    }

}
