package test01_자바기본;

import java.util.Scanner;

public class Q10_성적확인 {
    
    // boolean 을 활용하여 검색결과 확인하기
    public static void main(String[] args) {
        String course[] = { "Java", "C++", "HTML5" };
        int score[] = { 95, 88, 76 };
        Scanner sc = new Scanner(System.in);
        while (true) {
            boolean input = true;
            System.out.print("과목 이름>>");
            String subject = sc.next();
            if (subject.equals("stop")) {
                break;
            }
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(subject)) {
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    input = false;
                }
            }
            if (input == true) {
                System.out.println("없는 과목입니다");
            }
        }
        sc.close();

    }
}
