package study01_자바기본;

import java.util.Scanner;

public class S04_조건문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if-else 문
        char grade;
        System.out.print("점수 입력(0~100): ");
        int score = sc.nextInt();
        if (score >= 90) grade = 'A';
        else if (score >= 80) grade = 'B';
        else if (score >= 70) grade = 'C';
        else if (score >= 60) grade = 'D';
        else grade = 'F';
        System.out.printf("학점은 %c 입니다 %n", grade);

        // switch-case 문
        int price = 0;
        System.out.print("메뉴 선택: ");
        String order = sc.next();
        switch (order) {
            case "카페라떼":
            case "바닐라라떼":
                price = 3000;
                break;
            case "아메리카노":
                price = 2000;
                break;
            default:
                System.out.println("메뉴 없음");
        }
        if (price != 0) System.out.printf("%s는 %d원입니다 %n", order, price);
        sc.close();
    }

}
