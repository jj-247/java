package test01_자바기본;

import java.util.Scanner;

public class Q04_369게임 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~99 사이의 정수를 입력하시오>>");
        int num = sc.nextInt();
        if (num % 10 != 0 && (num % 10) % 3 == 0) { // 1의 자리가 369일 때
            if (num >= 10 && (num / 10) % 3 == 0) // 1의 자리와 10의 자리가 369일 때
                System.out.println(num + "박수짝짝");
            else
                System.out.println(num + "박수짝");
        } else if (num >= 10 && (num / 10) % 3 == 0) { // 10의 자리가 369일 때
            System.out.println("박수짝");
        }
//        if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
//            if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
//                System.out.println("박수짝짝");
//            else
//                System.out.println("박수짝");
//        } else if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
//            System.out.println("박수짝");
//        }
        sc.close();
    }

}
