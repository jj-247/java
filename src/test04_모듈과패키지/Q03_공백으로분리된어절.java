package test04_모듈과패키지;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q03_공백으로분리된어절 {

    // StringTokenizer 사용하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(">>");
            String text = sc.nextLine();
            if (text.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            StringTokenizer st = new StringTokenizer(text, " ");
            System.out.println("어절 개수는 " + st.countTokens());
        }
        sc.close();
    }

}
