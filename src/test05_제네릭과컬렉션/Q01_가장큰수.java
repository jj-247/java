package test05_제네릭과컬렉션;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Q01_가장큰수 {

    // Collections 사용하기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var v = new Vector<Integer>();
        System.out.print("정수(-1이 입력될 때까지)>>");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            v.add(num);
        }
        if (v.size() > 0) {
            System.out.println("가장 큰 수는 " + Collections.max(v));
        } else {
            System.out.println("내용 없음");
        }
        sc.close();
    }

}
