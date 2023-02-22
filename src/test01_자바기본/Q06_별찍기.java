package test01_자바기본;

import java.util.Scanner;

public class Q06_별찍기 {
    // e 입력시
    // abcde
    // abcd
    // abc
    // ab
    // a

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 5 - i) {
                System.out.print("*");
                j++;
            }
            if (j == 0)
                break;
            System.out.println();
            i++;
        }
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0); // Scanner는 문자를 입력받는 기능이 없다
        for (int x = 0; x < 5; x++) {
            int num = 4;
            for (int y = 0; y < 5 - x; y++) {
                System.out.print((char) (c - num));
                num--;
            }
            System.out.println();
        }
        sc.close();
    }

}
