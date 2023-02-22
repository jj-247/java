package study06_입출력스트림과파일입출력;

import java.io.IOException;
import java.io.InputStreamReader;

public class S01_스트림입출력 {

    public static void main(String[] args) throws IOException {
        // 스트림의 양 끝에는 입출력 장치와 자바 응용프로그램이 연결된다
        // 스트림은 단방향이다
        // 스트림을 통해 흘러가는 기본 단위는 바이트나 문자이다
        // 스트림은 선입선출, 즉 FIFO 구조이다

        // 입출력 스트림은 문자 스트림과 바이트 스트림 2종류로 나눈다
        // 바이트 스트림을 다루는 클래스는 공통적으로 이름 뒤에 Stream 을 붙인다
        // 문자 스트림을 다루는 클래스는 Reader/Writer 를 붙여 구분한다
        // 자바에서 char 타입 문자 하나의 크기는 2바이트이다
        InputStreamReader isr = new InputStreamReader(System.in);
        // 자바 응용프로그램은 다음과 같이 입력한 문자를 읽을 수 있다
        int c = isr.read();
    }

}
