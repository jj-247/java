package test01_자바기본;

import java.util.Scanner;

public class Q01_환전 {
    // 원화를 달러화로 환전하기

    // Scanner 사용하기
    // printf() %.1f 소수점 첫째자리까지 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원)>>");
        int won = sc.nextInt();
        double dollar = won / 1100;
        System.out.printf("%d원은 $%.1f입니다", won, dollar);
        sc.close();
    }

}
