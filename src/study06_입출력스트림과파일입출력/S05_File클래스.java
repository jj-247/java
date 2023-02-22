package study06_입출력스트림과파일입출력;

import java.io.File;

public class S05_File클래스 {

    public static void main(String[] args) {
        // File 클래스는 파일이나 디렉터리에 대해 경로명, 크기, 타입, 수정 날짜등의 속성 정보 제공 및 파일 관리 작업 지원

        // 파일 객체 생성
        File f1 = new File("src\\study06_입출력스트림과파일입출력\\text.txt");
        File f2 = new File("src\\study06_입출력스트림과파일입출력", "text.txt");

        // 파일 클래스를 이용한 파일 및 디렉터리 관리
        
        // boolean mkdir() : 새로운 디렉터리 생성

        // length() : 파일 크기
        long size = f1.length();

        // 파일의 경로명
        // getName() : 파일명
        // getPath() : 완전경로명
        // getParent() : 부모 디렉터리

        // 파일 타입 판별 : isFile(), isDirectory()
        
        // listFiles() : 디렉터리에 있는 파일 리스트 얻기
        File f = new File("src\\study06_입출력스트림과파일입출력");
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.print(files[i].getName()); // 파일명 출력
            System.out.println("\t파일 크기 : " + files[i].length()); // 파일 크기 출력
        }
    }
    
}
