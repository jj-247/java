package test04_모듈과패키지;

import java.util.Scanner;

public class Q06_문자열수정 {
    // text 에 입력한 문자를 변경하기 a!b = a를 b로 변환
    
    // replace() 사용하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>");
        String text = sc.nextLine();
        StringBuffer sb = new StringBuffer(text);
        while (true) {
            System.out.print("명령: ");
            // a!b
            String order = sc.nextLine();
            if (order.equals("그만")) {
                System.out.print("종료합니다");
                break;
            }
            String[] tokens = order.split("!");
            // split 한 결과가 토큰 2개가 아닐 때
            if (tokens.length != 2) {
                System.out.println("잘못된 명령입니다!");
            } else {
                // 문자열이 공백일 때
                if (tokens[0].length() == 0 || tokens[1].length() == 0) {
                    System.out.println("잘못된 명령입니다!");
                    continue;
                }
                // text 에서 토큰 검색하기
                int index = sb.indexOf(tokens[0]);
                // 토큰이 없을 때
                if (index == -1) {
                    System.out.println("찾을 수 없습니다!");
                    continue;
                }
                sb.replace(index, index + tokens[0].length(), tokens[1]);
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }

}
