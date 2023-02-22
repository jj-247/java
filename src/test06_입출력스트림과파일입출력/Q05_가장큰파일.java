package test06_입출력스트림과파일입출력;

import java.io.File;
import java.util.Scanner;

public class Q05_가장큰파일 {

    public static void main(String[] args) {
        File f = new File("src\\test06_입출력스트림과파일입출력");
        File[] files = f.listFiles();
        String name = null;
        long size = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].length() > size) {
                size = files[i].length();
                name = files[i].getName();
            }
        }
        System.out.printf("가장 큰 파일은 %s %d 바이트%n", name, size);
    }

}
