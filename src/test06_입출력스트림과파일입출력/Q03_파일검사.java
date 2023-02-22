package test06_입출력스트림과파일입출력;

import java.io.*;
import java.util.Scanner;

public class Q03_파일검사 {
    // phone.txt, phone_copied.txt

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String parent = "src\\test06_입출력스트림과파일입출력\\";
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String file1 = sc.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String file2 = sc.nextLine();
        System.out.printf("%s과 %s를 비교합니다.%n", file1, file2);
        FileInputStream fis1 = new FileInputStream(parent + file1);
        FileInputStream fis2 = new FileInputStream(parent + file2);
        byte b1[] = new byte[1024];
        byte b2[] = new byte[1024];
        fis1.read(b1);
        fis2.read(b2);
        boolean check = true;
        for (int i = 0; i < b1.length; i++) {
            if (b1[i] != b2[i]) {
                check = false;
            }
        }
        if (check == true) {
            System.out.println("파일이 같습니다.");
        } else {
            System.out.println("파일이 다릅니다.");
        }
        sc.close();
        fis1.close();
        fis2.close();
    }

}
