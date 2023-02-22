package test06_입출력스트림과파일입출력;

import java.io.File;

public class Q06_파일삭제 {
    // 효정_copied.jpg
    
    // lastIndexOf() 사용하기
    public static void main(String[] args) {
        System.out.println("src 디렉터리의 copied.jpg 파일을 모두 삭제합니다");
        File f = new File("src\\test06_입출력스트림과파일입출력");
        File[] files = f.listFiles();
        int count = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().lastIndexOf("copied.jpg") != -1) {
                System.out.println(files[i].getName() + " 삭제");
                files[i].delete();
                count++;
            }
        }
        System.out.printf("총 %d개의 copied.jpg 파일을 삭제하였습니다.%n", count);
    }

}