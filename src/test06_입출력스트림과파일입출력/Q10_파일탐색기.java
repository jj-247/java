package test06_입출력스트림과파일입출력;

import java.io.File;
import java.util.Scanner;
import java.util.Vector;

public class Q10_파일탐색기 {

    public static void main(String[] args) {
        System.out.println("***** 파일 탐색기입니다. *****");
        String path = ".\\";
        Scanner sc = new Scanner(System.in);
        while (true) {
            File f = new File(path);
            File[] files = f.listFiles();
            System.out.printf("\t[%s]%n", f.getPath());
            String res = "";
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) res = "file";
                else if (files[i].isDirectory()) res = "dir";
                System.out.printf("%s %d 바이트 %s%n", res, files[i].length(), files[i].getName());
            }
            System.out.print(">>");
            String fileName = sc.next();
            if (fileName.equals("그만")) {
                break;
            } else if (fileName.equals("..")) {
                path = path.replace(f.getName(), "");
            } else {
                path = path.concat("\\" + fileName);
            }
        }
    }

}
