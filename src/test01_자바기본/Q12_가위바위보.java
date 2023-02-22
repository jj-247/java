package test01_자바기본;

import java.util.Random;
import java.util.Scanner;

public class Q12_가위바위보 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rps = {"가위", "바위", "보"};
        Random rd = new Random();
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
        while (true) {
            System.out.print("가위 바위 보!>>");
            String player = sc.next();
            String com = rps[rd.nextInt(3)];
            if (player.equals("그만")) {
                System.out.println("게임종료");
                break;
            }
            System.out.printf("사용자 = %s, 컴퓨터 = %s, ", player, com);
            if (player.equals(com)) {
                System.out.print("비겼습니다.");
            } else if (player.equals(rps[0])) {
                if (com.equals(rps[2])) {
                    System.out.print("사용자가 이겼습니다");
                } else {
                    System.out.print("사용자가 졌습니다");
                }
            } else if (player.equals(rps[1])) {
                if (com.equals(rps[0])) {
                    System.out.print("사용자가 이겼습니다");
                } else {
                    System.out.print("사용자가 졌습니다");
                }
            } else {
                if (com.equals(rps[1])) {
                    System.out.print("사용자가 이겼습니다");
                } else {
                    System.out.print("사용자가 졌습니다");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
