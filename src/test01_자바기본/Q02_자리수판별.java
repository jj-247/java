package test01_자바기본;

import java.util.Scanner;

public class Q02_자리수판별 {
    // 10의 자리와 1의 자리의 수가 같은지 판별하기

    // 삼항연산자 사용하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99)>>");
        int num = sc.nextInt();
        System.out.println((num / 10 == num % 10) ? "Yes! 10의 자리와 1의 자리가 같습니다." : "No! 10의 자리와 1의 자리가 다릅니다.");
        sc.close();
    }

}
