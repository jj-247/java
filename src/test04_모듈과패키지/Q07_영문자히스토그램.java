package test04_모듈과패키지;

import java.util.Scanner;

public class Q07_영문자히스토그램 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
//		while(true) {
//			String input = sc.nextLine();
//			if(input.equals(";")) {
//				break;
//			}
//			sb.append(input);
//		}
//		String text = sb.toString().toUpperCase();
        String input = "It's now or never, come hold me tight Kiss me my darling, be mine tonight Tomorrow will be too late It's now or never, my love won't wait When I first saw you, with your smile so tender My heart was captured, my soul surrendered I spent a lifetime,waiting for the right time Now that your near, the time is here, at last It's now or never, come hold me tight Kiss me my darling, be mine tonight Tomorrow will be too late It's now or never, my love won't wait.";
        String text = input.toUpperCase();
        System.out.println("히스토그램을 그립니다.");
        // 65~90 알파벳 대문자
        for (int i = 65; i < 91; i++) {
            System.out.print((char) i); // 알파벳 A~Z 까지 출력
            for (int j = 0; j < text.length(); j++) { // text 의 문자가 반복문의 현재 알파벳과 일치할 경우 "-" 누적
                if (text.charAt(j) == (char) i) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
