package study06_입출력스트림과파일입출력;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class S04_버퍼입출력 {

    public static void main(String[] args) throws IOException {
        // 운영체제 API 가 호출될수록 시스템의 효율은 나빠진다
        // 스트림이 버퍼(데이터를 일시적으로 저장하기 위한 메모리)를 가지게 되면 보다 효율적으로 작동할 수 있다
        // 데이터의 타입에 따라 바이트 버퍼 스트림과 문자 버퍼 스트림으로 구분
        // 개발자에게 보이는 면은 입출력 스트림과 동일

        // 버퍼 출력 스트림 생성
        BufferedOutputStream bos = new BufferedOutputStream(System.out, 20); // 20바이트 버퍼
        // 스트림 출력
        FileReader fr = new FileReader("src\\study06_입출력스트림과파일입출력\\text.txt");
        int c;
        while ((c = fr.read()) != -1) { // 파일 끝을 만날 때까지 문자들을 하나씩 읽는다
            bos.write((char) c); // 읽은 문자를 버퍼 출력 스트림에 쓴다
        }
        // 버퍼에 남아있는 데이터 출력
        // 버퍼가 꽉 찼을 때만 출력되는 특징이 있다
        // 버퍼가 다 차지 않은 상태에서 버퍼에 있는 데이터를 강제로 출력장치로 보내기
        bos.flush(); // 스트림의 버퍼에 있는 데이터를 모두 장치에 출력
        bos.close();
        fr.close();
    }

}
