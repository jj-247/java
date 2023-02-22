package test02_클래스와객체;

import java.util.Scanner;

public class Reservation {
    // 좌석 예약하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] seat = new String[3][10];
        int menu;
        int rank;
        String name;
        int seatNum;
        Hall hall = new Hall();
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                rank = sc.nextInt();
                hall.rankSelect(rank);
                System.out.print("이름>>");
                name = sc.next();
                System.out.print("번호>>");
                seatNum = sc.nextInt();
                hall.res(rank, name, seatNum);
            } else if (menu == 2) {
                hall.resStatus();
            } else if (menu == 3) {
                System.out.print("좌석 S(1), A(2), B(3)>>");
                rank = sc.nextInt();
                hall.rankSelect(rank);
                System.out.print("이름>>");
                name = sc.next();
                System.out.print("번호>>");
                seatNum = sc.nextInt();
                hall.resCancel(rank, name, seatNum);
            } else if (menu == 4) {
                break;
            } else {
                System.out.println("입력오류");
            }
        }
        sc.close();
    }

}
