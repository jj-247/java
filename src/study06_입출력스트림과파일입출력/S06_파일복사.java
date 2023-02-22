package study06_입출력스트림과파일입출력;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class S06_파일복사 {

    public static void main(String[] args) throws IOException {
        // 블록 단위로 파일 고속 복사
        File src = new File("src\\study06_입출력스트림과파일입출력\\효정.jpg");
        File dest = new File("src\\study06_입출력스트림과파일입출력\\효정_copied.jpg");
        FileInputStream fi = new FileInputStream(src); // 파일 입력 바이트 스트림
        FileOutputStream fo = new FileOutputStream(dest); // 파일 출력 바이트 스트림
        byte[] buf = new byte[1024 * 10]; // 10KB 버퍼
        while (true) {
            int n = fi.read(buf); // 버퍼 크기만큼 읽기 n은 실제 읽은 바이트
            fo.write(buf, 0, n); // buf[0]부터 n 바이트 쓰기
            if (n < buf.length) break;
        }
        fi.close();
        fo.close();
        System.out.printf("%s를 %s로 복사하였습니다", src.getPath(), dest.getPath());
    }

}
