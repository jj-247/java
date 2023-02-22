package study06_입출력스트림과파일입출력;

import java.io.*;

public class S02_문자스트림 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("c:/windows/system.ini");
        // 파일 읽기
        int c;
        while ((c = fr.read()) != -1) { // 문자를 c에 읽어들인다
            System.out.print((char) c); // 문자 c를 출력
        }
        // 스트림이나 파일에 -1이 있을 때 어떻게 구분할 수 있는가?
        // read()는 int 타입으로 리턴하므로 0xFF를 32비트의 0x000000FF로 리턴한다 이것은 -1이 아니다
        // 스트림이나 파일에서 read()가 0xFF의 값을 읽어 리턴하는 것과 구분 된다
        char[] buf1 = new char[1024];
        int n = fr.read(buf1); // 한 번에 1024개 문자를 읽어 buf[]에 저장하고 실제 읽은 문자 수 리턴

        // int read() : 한 개의 문자를 읽어 정수형으로 리턴
        // int read(char[] buf) : 문자들을 읽어 buf 배열에 저장하고 읽은 개수 리턴
        // int read(char[] buf, int off, int len) : 최대 len 개수의 문자들을 읽어 buf 배열의 off 위치부터 저장하고 실제 읽은 개수 리턴
        // String getEncoding() : 스트림이 사용하는 문자 집합의 이름 리턴
        // void close() : 입력 스트림을 닫고 관련된 시스템 자원 해제

        // InputStreamReader 로 문자 입력 스트림 생성
        FileInputStream fin = new FileInputStream("src\\study06_입출력스트림과파일입출력\\text.txt");
        InputStreamReader isr = new InputStreamReader(fin, "MS949");

        // 파일 출력 스트림 생성
        FileWriter fw = new FileWriter("src\\study06_입출력스트림과파일입출력\\text.txt");
        // 파일 쓰기
        fw.write('A'); // 문자 A를 파일에 저장
        char[] buf2 = new char[5];
        fw.write(buf2, 0, buf2.length); // 배열의 처음부터 배열 크기만큼 쓰기
        // 스트림 닫기
        fw.close();

        // void write(int c) : c를 char 로 변환하여 한 개의 문자 출력
        // void write(String str) : 문자열 str 출력
        // void write(String str, int off, int len) : 인덱스 off 부터 len 개의 문자를 str 문자열에서 출력
        // void write(char[] buf, int off, int len) : 인덱스 off 부터 len 개의 문자를 배열 buf 에서 출력
        // void flush() : 스트림에 남아있는 데이터 모두 출력
        // String getEncoding() : 스트림이 사용하는 문자 집합의 이름 리턴
        // void close() : 출력 스트림을 닫고 관련된 시스템 자원 해제
    }

}
