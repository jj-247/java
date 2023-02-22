package test06_입출력스트림과파일입출력;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Q09_파일검색 {
    
    
    // IndexOf() 사용하기
    public static void main(String[] args) throws IOException {
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        String parent = "src\\test06_입출력스트림과파일입출력\\";
        Scanner sc = new Scanner(System.in);
        System.out.print("대상 파일명 입력>> ");
        String fileName = sc.next();
        File f = new File(parent + fileName);
        FileReader fr = new FileReader(f);
        Vector<String> line = new Vector<>();
        int i = 0;
        Scanner fs = new Scanner(fr);
        while (fs.hasNext()) {
            i++;
            line.add(i + ": " + fs.nextLine());
        }
        sc.nextLine();
        fs.close();
        while (true) {
            System.out.print("검색할 단어나 문장>> ");
            String search = sc.nextLine();
            if(search.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            for (String word : line){
                if (word.indexOf(search) != -1) {
                    System.out.println(word);
                }
            }
        }
    }

}
