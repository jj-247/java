package test04_모듈과패키지;

import java.util.Random;
import java.util.Scanner;

public class Q05_갬블링게임 {
    // Person

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] num = new int[3]; // 3개의 갬블링 숫자
        System.out.print("갬블링 게임에 참여할 선수 숫자>>");
        int player = sc.nextInt();
        Person[] players = new Person[player]; // 게임 참가자 수
        for (int i = 0; i < players.length; i++) {
            System.out.print((i + 1) + "번째 선수 이름>>");
            players[i] = new Person(sc.next());
        }
        sc.nextLine();
        boolean finish = true;
        while (finish) {
            for (int i = 0; i < players.length; i++) {
                System.out.printf("[%s]:<Enter>", players[i].getName());
                sc.nextLine();
                // 3개의 갬블링 숫자 출력
                for (int j = 0; j < 3; j++) {
                    num[j] = rd.nextInt(3) + 1;
                    System.out.print(num[j] + " ");
                }
                // 3개의 숫자가 같으면 승리
                if (num[0] == num[1] && num[0] == num[2]) {
                    System.out.println(players[i].getName() + "님이 이겼습니다!");
                    finish = false;
                } else {
                    System.out.println("아쉽군요!");
                }
            }
        }
        sc.close();
    }

}
