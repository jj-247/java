package test06_입출력스트림과파일입출력;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Q07_연락처검색 {
    // phone.txt

    public static void main(String[] args) throws IOException {
        String path = "src\\test06_입출력스트림과파일입출력\\phone.txt";
        HashMap<String, String> phone = new HashMap<>();
        FileReader fr = new FileReader(path);
        Scanner fs = new Scanner(fr);
        while (fs.hasNext()) {
            String kv = fs.nextLine();
            phone.put(kv.split(" ")[0], kv.split(" ")[1]);
        }
        System.out.printf("총 %d개의 전화번호를 읽었습니다.%n", phone.size());
        fs.close();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("이름>>");
            String name = sc.next();
            if(name.equals("그만")) break;
            if(phone.get(name)==null){
                System.out.println("찾는 이름이 없습니다");
            }else{
                System.out.println(phone.get(name));
            }
        }
        fr.close();
        sc.close();
    }

}
