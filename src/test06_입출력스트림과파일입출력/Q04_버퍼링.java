package test06_입출력스트림과파일입출력;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q04_버퍼링 {
    // 효정.jpg, 효정_copied.jpg
    
    // Thread.sleep() 사용하기
    public static void main(String[] args) throws IOException, InterruptedException {
        File src = new File("src\\test06_입출력스트림과파일입출력\\효정.jpg");
        File dest = new File("src\\test06_입출력스트림과파일입출력\\효정_copied.jpg");
        System.out.printf("%s를 %s로 복사합니다.%n", src.getName(), dest.getName());
        System.out.println("10%마다 *를 출력합니다.");
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        byte[] buf = new byte[(int) src.length() / 10]; // 파일크기의 10% 버퍼 만들기
        while (true) {
            int n = fis.read(buf);
            fos.write(buf, 0, n);
            if (n < buf.length) break;
            System.out.print("*");
            Thread.sleep(200);
        }
        fis.close();
        fos.close();
    }

}
