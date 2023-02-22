package study06_입출력스트림과파일입출력;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class S03_바이트스트림 {

    public static void main(String[] args) throws IOException {
        // InputStream/OutputStream
        // 추상 클래스이며 바이트 입출력 처리를 위한 공통 기능을 가진 수퍼 클래스

        // FileInputStream/FileOutputStream
        // 파일로부터 바이너리 데이터를 읽거나 저장

        // DataInputStream/DataOutputStream
        // 기본 타입과 문자열의 값을 바이너리 형태로 입출력

        // 파일 출력 스트림 생성
        FileOutputStream fos = new FileOutputStream("src\\study06_입출력스트림과파일입출력\\test.out");
        // 파일 쓰기
        byte b1[] = {7, 51, 3, 4, -1, 24};
        for (int i = 0; i < b1.length; i++) {
            fos.write(b1[i]); // 배열 b[]의 바이트 모두 파일 저장
        }

        // 파일 입력 스트림 생성
        FileInputStream fis = new FileInputStream("src\\study06_입출력스트림과파일입출력\\test.out");
        // 파일 읽기
        byte b2[] = new byte[6];
//        int n = 0, c;
//        while ((c = fis.read()) != -1) { // 파일 끝(EOF)까지 한 바이트씩 읽기
//            b2[n] = (byte) c; // 읽은 바이트를 배열에 저장
//            n++;
//        }
        fis.read(b2); // 파일에서 배열 b[]의 크기만큼 바이트 읽기(위의 반복문을 한줄로 바꿈)
        for (int i = 0; i < b2.length; i++) {
            System.out.print(b2[i] + " ");
        }
        System.out.println();
        fis.close(); // 스트림 닫기
    }

}
