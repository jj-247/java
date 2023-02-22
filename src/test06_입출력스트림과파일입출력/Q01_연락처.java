package test06_입출력스트림과파일입출력;

import java.io.*;
import java.util.Scanner;

public class Q01_연락처 {
    // phone.txt, phone_copied.txt

    // FileWriter() 이어쓰기 사용하기
    // 자바의 File 에서 사용되는 상대 경로의 기준은 해당 클래스 파일이 있는 위치가 아니라 클래스 파일이 포함되어 있는 프로젝트 폴더이다.
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String parent = "src\\test06_입출력스트림과파일입출력\\"; // 현재 폴더
        String fileName = "phone.txt";
        String copyName = "phone_copied.txt";
        // 파일 생성 및 쓰기
        FileWriter fw1 = new FileWriter(parent + fileName, true); // true 설정시 이어쓰기 가능
        FileWriter fw2 = new FileWriter(parent + copyName, true);
        System.out.println("전화번호 입력 프로그램입니다.");
        while (true) {
            System.out.print("이름 전화번호 >> ");
            String np = sc.nextLine();
            if (np.equals("그만")) {
                break;
            }
            fw1.write(np, 0, np.length());
            fw1.write("\r\n", 0, 2); // \r 캐리지 리턴(문자의 새 줄을 시작하는 데 쓰이는 제어 문자)
            fw2.write(np, 0, np.length());
            fw2.write("\r\n", 0, 2);
        }
        fw1.close();
        fw2.close();
        sc.close();
        System.out.println(parent + fileName + "에 저장하였습니다.");
        // 파일 읽기
        FileReader fr = new FileReader(parent + fileName);
        System.out.println(parent + fileName + "를 출력합니다.");
        int c;
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
        }
        fr.close();
    }

}
