package test04_모듈과패키지;

import java.util.Scanner;

public class Q04_문자열회전 {

    // substring() 사용하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.substring(i + 1).concat(text.substring(0, i + 1)));
        }
        sc.close();
    }

}
