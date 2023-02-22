package test05_제네릭과컬렉션;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Q03_학생정보 {
    // Student

    // LinkedHashMap<>, keySet(), Iterator() 사용하기
    Scanner sc = new Scanner(System.in);
    LinkedHashMap<String, Student> hm = new LinkedHashMap<>();

    public void input() {
        // LinkedHashMap 을 활용하면 입력 순서대로 저장가능
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String input = sc.nextLine();
            hm.put(input.split(", ")[0], new Student(input.split(", ")[0], input.split(", ")[1], input.split(", ")[2],
                    Double.parseDouble(input.split(", ")[3])));
        }
    }

    public void showAll() {
        Set<String> keys = hm.keySet();
        Iterator<String> it = keys.iterator();
        System.out.println("--------------------");
        while (it.hasNext()) {
            String key = it.next();
            System.out.println("이름:" + hm.get(key).getName());
            System.out.println("학과:" + hm.get(key).getMajor());
            System.out.println("학번:" + hm.get(key).getCode());
            System.out.println("학점:" + hm.get(key).getScore());
            System.out.println("--------------------");
        }
    }

    public void showInfo() {
        while (true) {
            System.out.print("학생 이름 >> ");
            String search = sc.next();
            if (search.equals("그만"))
                break;
            System.out.printf("%s, %s, %s, %.1f %n", hm.get(search).getName(), hm.get(search).getMajor(), hm.get(search).getCode(), hm.get(search).getScore());

        }
    }

    public void run() {
        input();
        showAll();
        showInfo();
    }

    public static void main(String[] args) {
        Q03_학생정보 info = new Q03_학생정보();
        info.run();
        // 황기태, 모바일, 1, 4.1
        // 이재문, 안드로이드, 2, 3.9
        // 김남윤, 웹공학, 3, 3.5
        // 최찬미, 빅데이터, 4, 4.25
    }

}
