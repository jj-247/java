package test04_모듈과패키지;

import java.util.Calendar;
import java.util.Scanner;

public class Q02_경과시간맞추기 {

    // Math.abs() 사용하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = 2;
        int[][] score = new int[players][3]; // 1차원 플레이어번호, 2차원 0=시작, 1=끝, 2=점수
        int goal = 10;
        int winner = 0;
        int highScore = 60;
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        for (int i = 0; i < players; i++) {
            System.out.printf("플레이어%d 시작 <Enter>키>>", i + 1);
            sc.nextLine();
            Calendar time = Calendar.getInstance();
            score[i][0] = time.get(Calendar.SECOND);
            System.out.println("\t현재 초 시간 = " + score[i][0]);
            System.out.print("10초 예상 후 <Enter>키>>");
            sc.nextLine();
            time = Calendar.getInstance();
            score[i][1] = time.get(Calendar.SECOND);
            System.out.println("\t현재 초 시간 = " + score[i][1]);
            if (score[i][1] > score[i][0]) {
                score[i][2] = score[i][1] - score[i][0];
            } else { // 분이 넘어갔을 때 (Ex. 55~05)
                score[i][2] = 60 - score[i][0] + score[i][1];
            }
        }
        for (int i = 0; i < players; i++) {
            System.out.printf("플레이어%d의 결과 %d, ", i + 1, score[i][2]);
        }
        for (int i = 0; i < players; i++) {
            // Math.abs를 활용하여 10에 절대값이 가까운 수 찾기
            if (Math.abs(goal - score[i][2]) < highScore) {
                highScore = score[i][2];
                winner = i + 1;
            }
        }
        System.out.println("승자는 플레이어" + winner);
    }

}
