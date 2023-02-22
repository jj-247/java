package test06_입출력스트림과파일입출력;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Q08_단어검색 {
    // words.txt
    
    // startWith() 사용하기
    public static void main(String[] args) throws IOException {
        File wordFile = new File("src\\test06_입출력스트림과파일입출력\\words.txt");
        Vector<String> words = new Vector<>();
        FileReader fr = new FileReader(wordFile);
        Scanner fs = new Scanner(fr);
        while (fs.hasNext()) {
            words.add(fs.nextLine());
        }
        fs.close();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int count = 0;
            System.out.print("단어>>");
            String search = sc.next();
            if (search.equals("그만")) {
                System.out.println("종료합니다");
                break;
            }
            for (String word : words) {
                if (word.startsWith(search)) {
                    System.out.println(word);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("발견할 수 없음");
            }
        }
        fr.close();
        sc.close();
    }

}
