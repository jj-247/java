package test06_입출력스트림과파일입출력;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q02_라인번호 {

    public static void main(String[] args) throws IOException {
        String path = "c:/windows/system.ini";
        System.out.println(path + "파일을 읽어 출력합니다");
        FileReader fr = new FileReader(path);
        int i = 0;
        // Scanner 의 nextLine() 사용하기
        Scanner sc = new Scanner(fr);
        while (sc.hasNext()) {
            i++;
            System.out.printf("%2d: ", i);
            System.out.println(sc.nextLine());
        }
        sc.close();
        fr.close();
    }

}
