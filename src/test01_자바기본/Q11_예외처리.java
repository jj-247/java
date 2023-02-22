package test01_자바기본;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q11_예외처리 {

    // 예외처리 사용하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("곱하고자 하는 두 수 입력>>");
            try {
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.printf("%d x %d = %d", n, m, n * m);
                break;
            } catch (InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다");
                sc.nextLine();
            }
        }
    }

}
